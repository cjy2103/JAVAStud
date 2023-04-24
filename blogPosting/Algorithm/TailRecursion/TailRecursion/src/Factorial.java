public class Factorial {
    public int factorialTailRecursive(int n, int acc){
        if(n == 0){
            return acc;
        } else {
            return factorialTailRecursive(n-1, n*acc);
        }
    }
}
