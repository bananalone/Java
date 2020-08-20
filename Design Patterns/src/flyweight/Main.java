package flyweight;

public class Main {
    public static void main(String[] args) {

        Shape circle = ShapePool.getShape("CIRCLE");
        Shape rectangle = ShapePool.getShape("Rectangle");
        Shape circle1 = ShapePool.getShape("Circle");

        circle.draw();
        rectangle.draw();
        circle1.draw();
    }
}
