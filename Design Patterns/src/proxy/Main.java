package proxy;

public class Main {
    public static void main(String[] args) {
        TimeProxy tp = new TimeProxy(new LogProxy(new Plane()));
        tp.move();
    }
}
