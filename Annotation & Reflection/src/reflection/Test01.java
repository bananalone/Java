package reflection;

public class Test01 {

    public static void main(String[] args) throws ClassNotFoundException {

        User u = new User();
        Class c1 = u.getClass();
        Class c2 = User.class;
        Class c3 = Class.forName("reflection.User");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        Class c4 = c3.getSuperclass();
        System.out.println(c4);
    }

}


class User {

    private String name;
    private int id;
    private int age;
    public String pubField;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", pubField='" + pubField + '\'' +
                '}';
    }

    private void privMethod() {

    }
}