public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//
//        vehicle.speedCheck(new Speed() {
//            @Override
//            public String overSpeed(int num, int speed) {
//                System.out.println(num+"번 차량");
//                System.out.println("속도체크 결과 속도:"+speed);
//                return "속도위반입니다.";
//            }
//        });
//
//
//
//        vehicle.speedCheck((num, speed) -> {
//            System.out.println(num+"번 차량");
//            System.out.println("속도체크 결과 속도:"+speed);
//            return "속도위반입니다.";
//        });

//        RambdaTest rambdaTest = new RambdaTest();
//        rambdaTest.setA(20);
//        rambdaTest.setB(40);
//
//        rambdaTest.plus(((a, b) -> {
//            return a+b;
//        }));

//        Runnable runnable = () ->{
//            for(int i=0 ;i< 100; i++){
//                System.out.println(i);
//            }
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();

        Thread thread = new Thread(()->{
           for(int i=0;i<100;i++){
               System.out.println(i);
           }
        });
        thread.start();

    }
}
