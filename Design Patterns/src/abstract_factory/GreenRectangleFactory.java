package abstract_factory;

public class GreenRectangleFactory implements AbstractFactory {
    @Override
    public Color getColor() {
        return new Green();
    }

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
