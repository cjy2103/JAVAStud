

public class Main {
    public static void main(String[] args) {
        Person person = new Person("철수",25);
        Person person2 = new Person("영희",22);

        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());

        System.out.println(person.equals(person2));
    }
}