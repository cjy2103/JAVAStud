
public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println(factorial.recursiveFac(5));
        System.out.println(factorial.normalFac(5));

        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(fibonacciNumber.recursiveFib(5));
        System.out.println(fibonacciNumber.normalFib(5));
    }
}
