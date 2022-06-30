public class Main {
    public static void main(String[] args) {
        Number number = new Number();
        Number number2 = new Number();

        number.num++;
        number.num2++;

        System.out.println(number2.num);
        System.out.println(number2.num2);


        Print.staticPrint();
        Print testPrint = new Print();
        testPrint.print();

    }
}
