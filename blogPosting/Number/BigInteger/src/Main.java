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

        // ����
        System.out.println("����: " + e.add(f));  // ����
        System.out.println("����: " + e.subtract(f)); // ����
        System.out.println("����: " + e.multiply(f)); // ����
        System.out.println("������: " + e.divide(f));  // ������
        System.out.println("������: " + e.remainder(f)); // ������


    }
}







//


