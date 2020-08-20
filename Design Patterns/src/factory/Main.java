package factory;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("Circle");
        Shape shape2 = ShapeFactory.getShape("Rectangle");
        shape1.draw();
        shape2.draw();
    }
}
