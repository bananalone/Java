package TestInetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {
        try {
            // 得到本机IP
            System.out.println(InetAddress.getByName("127.0.0.1"));
            System.out.println(InetAddress.getByName("localhost"));
            System.out.println(InetAddress.getLocalHost());

            // 得到网站
            InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress);

            // 常用方法
            System.out.println(inetAddress.getAddress());
            System.out.println(inetAddress.getCanonicalHostName());
            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress.getHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
