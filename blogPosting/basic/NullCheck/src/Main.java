import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Test test = null;
//        Test test = new Test();
        String temp = "";

        if(temp.isEmpty()){
            System.out.println("����");
        } else {
            System.out.println("�ξƴ�");
        }

        if(temp.isEmpty()){
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
