 public class Main {
    public static void main(String[] args) {
        final Test test = new Test();

        System.out.println(test.data);
        System.out.println(test.str);

        test.data = 100;
        test.str = "변경";

        System.out.println(test.data);
        System.out.println(test.str);


        final int a = 10;

    }
}
