package flyweight;

import java.util.UUID;

public class Rectangle implements Shape {

    private UUID id = UUID.randomUUID();

    @Override
    public void draw() {
        System.out.println("draw rectangle " + id.toString());
    }
}
