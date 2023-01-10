public class Main {
    public static void main(String[] args) {

        Plus plus = (a, b) -> a+b; // Integer::sum 으로 교체 가능

        int sum = plus.add(2,3);
        System.out.println("a + b -> "+sum);

        Minus minus = (a,b) -> {
            System.out.println("a - b -> "+(a-b));
        };

        minus.subtract(10,5);
    }
}