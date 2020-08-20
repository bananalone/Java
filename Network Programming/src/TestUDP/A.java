package TestUDP;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class A {
    public static void main(String[] args) {
        try {
            People a = new People.Builder()
                    .buildInfo("A")
                    .buildSender(InetAddress.getByName("127.0.0.1"), 9999)
                    .buildReceiver(8888)
                    .build();
            new Thread(() -> {
                try {
                    while (true) {a.send();}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(() -> {
                try {
                    while (true) {a.receive();}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (SocketException | UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
