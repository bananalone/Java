package dynamic_proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFile", "true");

        Tank tank = new Tank();
        Movable p = (Movable) Proxy.newProxyInstance(
                Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new TimeProxy(tank)
        );
        p.move();
    }
}
