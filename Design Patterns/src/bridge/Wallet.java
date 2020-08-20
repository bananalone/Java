package bridge;

public class Wallet extends Bag {

    public Wallet(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor() + " " + "Wallet";
    }
}
