package proxy;

public class LogProxy implements Movable {

    private Movable m;

    public LogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        m.move();
        System.out.println("end moving");
    }
}
