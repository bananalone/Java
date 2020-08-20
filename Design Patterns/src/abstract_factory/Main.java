package abstract_factory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory rcf = new RedCircleFactory();
        Shape s1 = rcf.getShape();
        Color c1 = rcf.getColor();

        s1.draw();
        c1.fill();

        System.out.println("=========================");

        AbstractFactory grf = new GreenRectangleFactory();
        Shape s2 = grf.getShape();
        Color c2 = grf.getColor();

        s2.draw();
        c2.fill();
    }
}
