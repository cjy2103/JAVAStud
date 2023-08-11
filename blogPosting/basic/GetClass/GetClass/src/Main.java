public class Main {
    public static void main(String[] args) {
        Object object1 = "Hello";
        Object object2 = 43;

        Class<?> object1Class = object1.getClass();
        System.out.println("object1 is an instance of : " + object1Class.getName());

        Class<?> object2Class = object2.getClass();
        System.out.println("object2 is an instance of : " + object2Class.getName());

    }
}