public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.setA(20);
        test.setB(50);

//        test.plus((a,b)->{
//            return a+b;
//        });

        test.plus(Integer::sum);

    }
}


