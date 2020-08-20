package TestTCP;

import java.io.*;
import java.net.Socket;


public class Client {
    private Socket client = null;

    public Client(String host, int port) throws IOException {
        client = new Socket(host, port);
    }

    public void close() throws IOException {
        if(client != null) {
            client.close();
        }
    }

    /**
     * 网络传输字符串
     */
    public void run() {
        DataOutputStream dos = null;
        DataInputStream dis = null;
        try {
            dos = new DataOutputStream(client.getOutputStream());
            System.out.println("发送给服务端的消息");
            String str = "server你好，这里是client";
            dos.writeUTF(str);
//            dos.writeUTF("附加的信息");
            System.out.println(str);
            System.out.println("来自服务端的消息");
            dis = new DataInputStream(client.getInputStream());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 网络传输字节 socket.shutdownOutput 通知服务端传输结束
     */
    public void run1() {
        OutputStream os = null;
        InputStream is = null;
        byte[] buf = new byte[1024];
        int len;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            os = client.getOutputStream();
            os.write("你好，我是client".getBytes());
            os.write(" 附件信息".getBytes());
//            os.close();
            client.shutdownOutput();
            is = client.getInputStream();
            while ((len = is.read(buf)) != -1) {
                baos.write(buf, 0, len);
            }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                baos.close();
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 网络传输java对象(序列化)
     * ObjectOutputStream writeObject(Object o)
     */
    public void run2() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(client.getOutputStream());
            Information info = new Information("client", "hello");
            oos.writeObject(info);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 9999;
        Client client = null;
        try {
            client = new Client(host, port);
            client.run2();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
