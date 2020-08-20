package TestUDP;

import java.io.IOException;
import java.net.*;

public class Sender {

    private DatagramSocket socket;
    private InetAddress receiver;
    private int port;

    public Sender(InetAddress receiver, int port) throws SocketException {
        socket = new DatagramSocket();
        this.receiver = receiver;
        this.port = port;
    }

    public void send(String str) throws IOException {
        byte[] data = str.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, receiver, port);
        socket.send(packet);
    }

    public void close() {
        if(socket != null) {
            socket.close();
        }
    }

    public static void main(String[] args) {
        Sender sender = null;
        try {
            sender = new Sender(InetAddress.getByName("127.0.0.1"), 9999);
            sender.send("hello");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sender.close();
        }
    }
}
