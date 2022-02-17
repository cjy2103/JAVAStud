public class Main {
    public static void main(String[] args) {
        final Test test = new Test();

        System.out.println(test.data);
        System.out.println(test.str);

        test.data = 100;
        test.str = "º¯°æ";

        System.out.println(test.data);
        System.out.println(test.str);


        final int a = 10;

        String string = "Test";
        Immutable immutable = new Immutable(string);
        string.concat("Day");
        System.out.println(immutable);
        System.out.println(string);
    }
}
