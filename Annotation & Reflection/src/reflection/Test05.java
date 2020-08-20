package reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Test05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        System.out.println("反射获取注解");
        Class c1 = Class.forName("reflection.Student");
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        TableAnnotation table = (TableAnnotation)c1.getAnnotation(TableAnnotation.class);
        System.out.println("注解的值 value: " + table.value());

        Field field = c1.getDeclaredField("id");
        FieldAnnotation f = (FieldAnnotation)field.getAnnotation(FieldAnnotation.class);
        System.out.println(f.columnName());
        System.out.println(f.length());
        System.out.println(f.type());
    }
}

@TableAnnotation("db_student")
class Student{

    @FieldAnnotation(columnName = "db_id", type = "int", length = 10)
    private int id;
    @FieldAnnotation(columnName = "db_name", type = "varchar", length = 5)
    private String name;
    @FieldAnnotation(columnName = "db_age", type = "int", length = 3)
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


// 类名注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableAnnotation {
    String value();
}


// 属性注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldAnnotation {
    String columnName();
    String type();
    int length();
}