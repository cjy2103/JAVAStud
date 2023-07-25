public class Main {
    public static void main(String[] args) {
        Car car = new Car("테슬라 모델3","Red",6000);
        CarDriver carDriver = new CarDriver();
        CarRepairShop carRepairShop = new CarRepairShop();


        car.printCarInfo();

        carDriver.drive(car);

        carRepairShop.repair(car);

    }
}