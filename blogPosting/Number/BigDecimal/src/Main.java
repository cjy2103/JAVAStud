import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;

        BigDecimal c = new BigDecimal("123.456");

        BigDecimal num = new BigDecimal(12345.678);

        BigDecimal d = new BigDecimal("0.1");
        BigDecimal e = new BigDecimal("0.2");

//        System.out.println(a+b);

//        System.out.println(c.intValue());
//        System.out.println(c.unscaledValue());
//        System.out.println(c.scale());
//        System.out.println(c.precision());

//        System.out.println(num);

        //연산식
        System.out.println(d.add(e));
        System.out.println(d.subtract(e));
        System.out.println(d.multiply(e));
        System.out.println(d.divide(e));
        System.out.println(d.remainder(e));

        //값 비교
        System.out.println(d.equals(e));
    }
}
