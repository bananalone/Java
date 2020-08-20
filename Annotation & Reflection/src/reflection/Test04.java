package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test04 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("reflection.User");

//        User user = (User)c1.newInstance(); // 本质调用无参构造器
//        System.out.println(user);
        System.out.println("反射创建对象");
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user = (User)constructor.newInstance("name", 18, 12);
        System.out.println(user);

        System.out.println("反射调用方法");
        Method method = c1.getDeclaredMethod("setName", String.class);
        method.invoke(user, "method invoke");
        System.out.println(user);

        System.out.println("反射操作属性");
        Field field = c1.getDeclaredField("name");
        field.setAccessible(true);
        field.set(user, "field");
        System.out.println(user);
    }
}
