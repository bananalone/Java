package decorator;

public class Main {
    public static void main(String[] args) {
        ShapeDecorator sd = new RedShapeDecorator(new Circle());
        sd.draw();
    }
}
