package observer;

public class Main {
    public static void main(String[] args) {
        Monkey m1 = new Monkey("m1");
        Monkey m2 = new Monkey("m2");
        Man p1 = new Man("p1");
        Woman p2 = new Woman("p2");
        m1.addEventObserver(p1).addEventObserver(p2);
        m2.addEventObserver(p2);

        m1.call();
        m2.run();
    }
}
