public class Main {
    public static void main(String[] args) {
        Car car = new Car("테슬라 모델 3", "RED", 6000);

        car.printCarInfo();

        car.drive();

        car.repair();
    }
}