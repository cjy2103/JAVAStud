public class Test {

    public void test(int grade){
        switch (grade/10){
            case 9 : System.out.println("학점은 A");
                break;
            case 8 : System.out.println("학점은 B");
                break;
            case 7 : System.out.println("학점은 C");
                break;
            case 6 : System.out.println("학점은 D");
                break;
            case 5 :
            case 4 :
            case 3 : System.out.println("학점 D-");
                break;
            default: System.out.println("학점은 F");
                break;
        }
        switch (grade / 10) {
            case 9 -> System.out.println("학점은 A");
            case 8 -> System.out.println("학점은 B");
            case 7 -> System.out.println("학점은 C");
            case 6 -> System.out.println("학점은 D");
            case 3,4,5 -> System.out.println("학점 D-");
            default -> System.out.println("학점은 F");
        }
    }



}
