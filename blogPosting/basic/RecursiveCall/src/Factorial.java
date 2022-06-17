public class Factorial {

    public int recursiveFac(int n){
        if(n <= 1 ) return n;

        return n*recursiveFac(n-1);
    }

    public int normalFac(int num){
        int result = 1;

        for(int i=1;i<=num;i++){
            result *= i;
        }

        return result;
    }
}
