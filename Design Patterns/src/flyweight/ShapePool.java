package flyweight;

import java.util.HashMap;

public class ShapePool {
    private static HashMap<String, Shape> pool = new HashMap<>();

    public static Shape getShape(String type){
        Shape shape = pool.get(type.toLowerCase());
        if(shape == null) {
            if(type.equalsIgnoreCase("circle")){
                shape = new Circle();
            } else if(type.equalsIgnoreCase("rectangle")) {
                shape = new Rectangle();
            }
            pool.put(type.toLowerCase(), shape);
        }
        return shape;
    }
}
