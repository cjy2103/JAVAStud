public class Test {

    public void test(int grade){
//        switch (grade/10){
//            case 9 : System.out.println("학점은 A");
//                break;
//            case 8 : System.out.println("학점은 B");
//                break;
//            case 7 : System.out.println("학점은 C");
//                break;
//            case 6 : System.out.println("학점은 D");
//                break;
//            default: System.out.println("학점은 F");
//                break;
//        }
        switch (grade / 10) {
            case 9 -> System.out.println("학점은 A");
            case 8 -> System.out.println("학점은 B");
            case 7 -> System.out.println("학점은 C");
            case 6 -> System.out.println("학점은 D");
            default -> System.out.println("학점은 F");
        }
    }



}
