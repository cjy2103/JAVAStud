public class RambdaTest {

    private int a = 0 ;
    private int b = 0;

    public void plus(Add add){
        int result = add.plus(a,b);
        System.out.println(result);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
