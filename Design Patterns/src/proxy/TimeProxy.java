package proxy;

public class TimeProxy implements Movable {

    private Movable m;

    public TimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) / 1000);
    }
}
