public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyInterface myInterface = () -> {
            System.out.println(MyInterface.MY_VARIABLE);
        };
        myInterface.myMethod();
    }


}