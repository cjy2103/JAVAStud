import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 ~ 3 ������ ���� �Է��ϼ���");

        int num = sc.nextInt();
        
        
        switch (num) {
            case 1 :
                System.out.println("1�Է���");
                break;
            case 2 :
                System.out.println("2�Է���");
                break;
            case 3 :
                System.out.println("3�Է���");
                break;
            default:
                System.out.println("`1 ~ 3 ������ ���ڸ� �Է��ϼ���`");
                break;
                
        }


    }
}
