public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        test.sum();
        test.sum(2,4);
        test.sum(1,2,3,4,5);

        test.strmulti("값의 결과:",1,2,3,4,5);
    }
}
