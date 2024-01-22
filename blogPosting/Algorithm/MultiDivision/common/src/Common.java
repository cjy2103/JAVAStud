public class Common {

    public int euclideanGcd(int a, int b){
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int lcm(int a, int b){
        int gcd = euclideanGcd(a, b);
        return a * b / gcd;
    }

}
