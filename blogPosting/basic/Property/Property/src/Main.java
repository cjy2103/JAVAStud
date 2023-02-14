public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "홍길동";
        person.age = 20;

        System.out.printf("""
                이름 : %s
                나이 : %d
                """, person.name, person.age);
    }
}