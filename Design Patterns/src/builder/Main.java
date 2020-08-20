package builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                        .basicInfo("张三", Gender.MAN)
                        .buildAge(13)
//                        .buildAddress("北京市 朝阳区")
                        .buildCareer("程序员")
                        .buildPhone(new Phone("123456"))
                        .build();
        System.out.println(person.toString());
    }
}
