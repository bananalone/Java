package TestUDP;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class B {
    public static void main(String[] args) {
        try {
            People b = new People.Builder()
                    .buildInfo("B")
                    .buildSender(InetAddress.getByName("127.0.0.1"), 8888)
                    .buildReceiver(9999)
                    .build();
            new Thread(() -> {
                try {
                    while (true) {b.send();}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(() -> {
                try {
                    while (true) { b.receive();}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (SocketException | UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
