package template_method;

public class Label extends Frame {
    @Override
    public void update() {
        System.out.println("Label update");
    }

    @Override
    public void draw() {
        System.out.println("Label draw");
    }
}
