package abstract_factory;

public class RedCircleFactory implements AbstractFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }

    @Override
    public Color getColor() {
        return new Red();
    }
}
