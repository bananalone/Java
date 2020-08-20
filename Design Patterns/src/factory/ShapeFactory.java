package factory;

import java.util.HashMap;

public class ShapeFactory {

    private static HashMap<String, Class> map = new HashMap<>();

    static {
        map.put("circle", Circle.class);
        map.put("rectangle", Rectangle.class);
    }

    public static Shape getShape(String type) {
        try {
            return (Shape)map.get(type.toLowerCase()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
