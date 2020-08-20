package flyweight;

import java.util.UUID;

public class Circle implements Shape {

    private UUID id = UUID.randomUUID();

    @Override
    public void draw() {
        System.out.println("draw circle " + id.toString());
    }
}
