import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int a = 100000;
        int b = 100000;
        long c = 10000000000L;
        long d = 10000000000L;
        BigInteger e = new BigInteger("10000000000");
        BigInteger f = new BigInteger("10000000000");
        System.out.println(a*b);
        System.out.println((long)a*b);
        System.out.println(c*d);

        // °è»ê½Ä
        System.out.println("µ¡¼À: " + e.add(f));  // µ¡¼À
        System.out.println("»¬¼À: " + e.subtract(f)); // »¬¼À
        System.out.println("°ö¼À: " + e.multiply(f)); // °ö¼À
        System.out.println("³ª´°¼À: " + e.divide(f));  // ³ª´°¼À
        System.out.println("³ª¸ÓÁö: " + e.remainder(f)); // ³ª¸ÓÁö


    }
}







//


