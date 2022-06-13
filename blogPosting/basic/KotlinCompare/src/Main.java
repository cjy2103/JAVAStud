import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 ~ 3 사이의 값을 입력하세요");

        int num = sc.nextInt();
        
        
        switch (num) {
            case 1 :
                System.out.println("1입력함");
                break;
            case 2 :
                System.out.println("2입력함");
                break;
            case 3 :
                System.out.println("3입력함");
                break;
            default:
                System.out.println("`1 ~ 3 사이의 숫자를 입력하세요`");
                break;
                
        }


    }
}
