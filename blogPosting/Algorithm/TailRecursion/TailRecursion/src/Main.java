public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int answer = factorial.factorialTailRecursive(5,1);
        System.out.println(answer);
    }
}