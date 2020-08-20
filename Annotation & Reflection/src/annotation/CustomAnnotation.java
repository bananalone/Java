package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotation {

    @MyAnnotation2(name = "name")
    public void method01() {

    }

    @MyAnnotation3("only value can be ignored")
    public void method02() {

    }
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

@interface MyAnnotation2{
    String name();
    int age() default 18;
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

@interface MyAnnotation3{
    String value();
}
