package composite;

public class Main {
    public static void main(String[] args) {
        BranchNode desktop = new BranchNode("Desktop");

        BranchNode imagesFolder = new BranchNode("images folder");
        LeafNode image1 = new LeafNode("image1");
        LeafNode image2 = new LeafNode("image2");
        imagesFolder.addNode(image1).addNode(image2);

        BranchNode filesFolder = new BranchNode("files folder");
        LeafNode file1 = new LeafNode("file1");
        LeafNode file2 = new LeafNode("file2");
        filesFolder.addNode(file1).addNode(file2);

        desktop.addNode(new LeafNode("config file"))
                .addNode(imagesFolder)
                .addNode(filesFolder);

        desktop.show();
    }
}
