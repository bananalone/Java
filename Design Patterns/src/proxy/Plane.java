package proxy;

import java.util.Random;

public class Plane implements Movable {

    @Override
    public void move() {
        System.out.println("The plane is flying");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
