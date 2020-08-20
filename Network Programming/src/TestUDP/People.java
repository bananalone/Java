package TestUDP;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class People {

    private Sender sender;
    private Receiver receiver;
    private String name;

    private People() {}


    public void send() throws IOException {
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextLine()) {
            String str = scan.nextLine();
            sender.send(name + ": " + str);
        }
    }

    public void receive() throws IOException {
        System.out.println(receiver.receive());
    }

    public static class Builder {

        private People people = new People();

        public People build() {
            return people;
        }

        public Builder buildInfo(String name) {
            people.name = name;
            return this;
        }

        public Builder buildSender(InetAddress receiver, int port) throws SocketException {
            people.sender = new Sender(receiver, port);
            return this;
        }

        public Builder buildReceiver(int port) throws SocketException {
            people.receiver = new Receiver(port);
            return this;
        }

    }

}
