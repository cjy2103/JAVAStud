import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        Test test = null;
        Test test = new Test();

        if(test == null){
            System.out.println("����");
        } else {
            test.test();
        }

        if(Objects.isNull(test)){
            System.out.println("����");
        } else {
            test.test();
        }

    }
}
