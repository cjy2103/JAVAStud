public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        vehicle.speedCheck(new Speed() {
            @Override
            public String overSpeed(int num, int speed) {
                System.out.println(num+"번 차량");
                System.out.println("속도체크 결과 속도:"+speed);
                return "속도위반입니다.";
            }
        });

//        vehicle.speedCheck((num, speed) -> {
//            System.out.println(num+"번 차량");
//            System.out.println("속도체크 결과 속도:"+speed);
//            return "속도위반입니다.";
//        });
    }
}
