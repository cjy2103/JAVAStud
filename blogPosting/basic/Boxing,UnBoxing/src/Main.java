public class Main {
    public static void main(String[] args) {
        //boxing
        Integer a = new Integer(10); // deprecated

        //auto boxing
        Integer integer = 10;
        System.out.println(integer);

        //unboxing
        int num = integer.intValue();

        //auto unboxing
        int num2 = integer;

        System.out.println(num2);
    }
}
