package composite;

public abstract class Node {
    public abstract void show(int depth);
    public void show(){
        show(1);
    }
}
