package template_method;

public class Button extends Frame {
    @Override
    public void update() {
        System.out.println("Button update");
    }

    @Override
    public void draw() {
        System.out.println("Button draw");
    }
}
