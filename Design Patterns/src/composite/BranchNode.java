package composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Node {

    private List<Node> nodes = new ArrayList<>();
    private String content;

    public BranchNode(String content){
        this.content = content;
    }

    public BranchNode addNode(Node node) {
        nodes.add(node);
        return this;
    }

    @Override
    public void show(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        System.out.println(content);
        for(Node node : nodes) {
            node.show(depth + 1);
        }
    }
}
