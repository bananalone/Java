package TestTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;


public class Server {

    private ServerSocket serverSocket = null;

    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void close() throws IOException {
        if(serverSocket != null) {
            serverSocket.close();
        }
    }

    /**
     * 网络传输字符串
     */
    public void run() {
        Socket server = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        try {
            server = serverSocket.accept();
            dis = new DataInputStream(server.getInputStream());
            System.out.println("来自客户端的消息");
            System.out.println(dis.readUTF());
            System.out.println("发送给客户端的消息");
            dos = new DataOutputStream(server.getOutputStream());
            String str = "client你好，这里是server";
            dos.writeUTF(str);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(server != null) {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 网络传输字节
     */
    public void run1() {
        Socket server = null;
        InputStream is = null;
        OutputStream os = null;
        ByteArrayOutputStream baos = null;
        byte[] buf = new byte[1024];
        int len;
        try {
            server = serverSocket.accept();
            is = server.getInputStream();
            baos = new ByteArrayOutputStream();
            while ((len = is.read(buf)) != -1){
                baos.write(buf, 0, len);
            }
            System.out.println(baos.toString());
            os = server.getOutputStream();
            os.write("你好，我是server".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                baos.close();
                is.close();
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 网络传输java对象(序列化)
     * ObjectInputStream readObject()
     */
    public void run2() {
        Socket server = null;
        ObjectInputStream ois = null;
        try {
            server = serverSocket.accept();
            ois = new ObjectInputStream(server.getInputStream());
            Information info = (Information)ois.readObject();
            System.out.println(info);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        int port = 9999;
        Server server = null;
        try {
            server = new Server(port);
//            while (true) {
//                server.run();
//            }
            server.run2();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
