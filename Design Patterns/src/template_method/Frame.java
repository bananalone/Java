package template_method;

public abstract class Frame {

    public void show() {
        update();
        draw();
    }

    public abstract void update();
    public abstract void draw();
}
