public class Main {
    public static void main(String[] args) {
        Common common = new Common();

        int gcd1 = common.euclideanGcd(5,15);
        System.out.println(gcd1);

        int gce2 = common.gcd(4,19);
        System.out.println(gce2);

        int lcm = common.lcm(24,30);
        System.out.println(lcm);
    }
}