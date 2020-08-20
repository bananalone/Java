package bridge;

public class Main {
    public static void main(String[] args) {
        Bag handBag = new HandBag(new Red());
        System.out.println(handBag.getName());
    }
}
