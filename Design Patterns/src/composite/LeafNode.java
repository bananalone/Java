package composite;

public class LeafNode extends Node {

    private String content;

    public LeafNode(String content){
        this.content = content;
    }

    @Override
    public void show(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        System.out.println(content);
    }

}
