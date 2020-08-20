package proxy;

import java.util.Random;

public class Tank implements Movable {

    @Override
    public void move() {
        System.out.println("The tank is running");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
