public class Main {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.normalFibonacci(5));
        System.out.println(fibonacci.normalFibonacci(10));

        System.out.println(fibonacci.dpFibonacci(5));
        System.out.println(fibonacci.dpFibonacci(10));

        System.out.println(fibonacci.fibonacci(5));
        System.out.println(fibonacci.fibonacci(10));
    }
}