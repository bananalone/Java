package TestUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class Receiver{

    private DatagramSocket socket;

    public Receiver(int port) throws SocketException {
        socket = new DatagramSocket(port);

    }

    public void close() {
        if(socket != null) {
            socket.close();
        }
    }

    public String receive() throws IOException {
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        byte[] data = packet.getData();
        int len = packet.getLength();
        SocketAddress sender = packet.getSocketAddress();
        StringBuilder sb = new StringBuilder("(" + sender.toString() + ")");
        String str = new String(data, 0, len);
        sb.append(" ").append(str);
        return sb.toString();
    }

    public static void main(String[] args) {
        Receiver receiver = null;
        try {
            receiver = new Receiver(9999);
            String str = receiver.receive();
            System.out.println(str);
            receiver.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            receiver.close();
        }
    }
}
