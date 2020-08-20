package annotation;

import java.lang.annotation.*;

@MyAnnotation
public class MetaAnnotation {

    @MyAnnotation
    public static void hello(String name) {
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        hello("world");
    }
}

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface MyAnnotation {}
