// Product
public class Person {
    private String name;
    private int age;
    private String address;

    // 생성자는 private로 선언하여 외부에서 직접 생성하지 못하도록 합니다.
    private Person() {

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    // PersonBuilder 클래스를 내부에 정의
    public static class PersonBuilder {
        private Person person = new Person();

        public PersonBuilder withName(String name){
            person.name = name;
            return this;
        }

        public PersonBuilder withAge(int age) {
            person.age = age;
            return this;
        }

        public PersonBuilder withAddress(String address) {
            person.address = address;
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
