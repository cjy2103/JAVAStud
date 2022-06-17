public class FibonacciNumber {
    public int recursiveFib(int n){
        if(n<=1) return n;
        return recursiveFib(n-1) + recursiveFib(n-2);
    }

    public int normalFib(int n){
        int reuslt = 0;
        int first = 1;
        int second = 1;
        if(n==1 || n==2){
            return 1;
        } else {
            for(int i=3; i<=n;i++){
                reuslt = first + second;
                first = second;
                second = reuslt;
            }
            return reuslt;
        }
    }
}
