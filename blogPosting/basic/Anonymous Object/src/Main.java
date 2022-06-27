import test.Test;
import test2.CheckEvent;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        test.check();

        CheckEvent checkEvent = new CheckEvent() {
            @Override
            public void check() {
                System.out.println("익명객체");
            }
        };
    }
}
