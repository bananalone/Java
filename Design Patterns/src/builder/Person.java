package builder;

public class Person {

    private String name;
    private int age;
    private Gender gender;
    private String career;
    private String address;
    private Phone phone;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", career='" + career + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }

    private Person() {}

    public static class PersonBuilder{
        private Person person = new Person();

        public PersonBuilder() {}

        public Person build() {
            return person;
        }

        public PersonBuilder basicInfo(String name, Gender gender) {
            person.name = name;
            person.gender = gender;
            return this;
        }

        public PersonBuilder buildAge(int age) {
            person.age = age;
            return this;
        }

        public PersonBuilder buildCareer(String career) {
            person.career = career;
            return this;
        }

        public PersonBuilder buildAddress(String address) {
            person.address =address;
            return this;
        }

        public PersonBuilder buildPhone(Phone phone) {
            person.phone = phone;
            return this;
        }
    }

}
