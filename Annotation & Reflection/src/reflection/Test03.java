package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test03 {

    public static void main(String[] args) throws NoSuchMethodException {
        User u = new User();
        Class c1 = u.getClass();

        // 得到类名
        System.out.println("获得类名");
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        // 得到public属性
        System.out.println("获得public属性");
        Field[] fields =  c1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 得到所有属性
        System.out.println("获得所有属性");
        fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 得到类及其父类public方法
        System.out.println("获得本类及其继承的父类public方法");
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // 得到类所有方法
        System.out.println("获得本类所有方法");
        methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // 得到类指定方法
        System.out.println("获得类的指定方法");
        Method method = c1.getMethod("setName", String.class);
        System.out.println(method);

        // 得到类的构造函数
        System.out.println("获得类的构造函数");
        Constructor constructor = c1.getConstructor(String.class, int.class, int.class);
        System.out.println(constructor);
    }

}
