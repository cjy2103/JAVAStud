public class Main {
    public static void main(String[] args) {

        int result;
        int c = 10;

        Number num = new Number();

        result = num.add(5, 10, (a, b) -> {
           // result = a+b; // 불가능
            return a+b+c;
        });

        System.out.println(result);
    }
}
