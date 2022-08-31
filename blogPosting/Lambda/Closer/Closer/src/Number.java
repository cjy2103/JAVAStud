public class Number {

    private int a;
    private int b;

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(Add add){
        int result = add.plus(a,b);
        return result;
    }
}
