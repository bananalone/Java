package TestInetSocketAddress;

import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 7777);
        System.out.println(inetSocketAddress);
        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getHostName());
//        System.out.println(inetSocketAddress.getHostString());
        System.out.println(inetSocketAddress.getPort());
    }

}
