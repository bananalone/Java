package bridge;

public class HandBag extends Bag {

    public HandBag(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor() + " " + "Hand bag";
    }
}
