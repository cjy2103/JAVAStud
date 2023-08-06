public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = () -> {
            System.out.println(MyInterface.MY_VARIABLE);
        };
        myInterface.myMethod();
    }

}