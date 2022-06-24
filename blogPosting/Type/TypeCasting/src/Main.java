public class Main {
    public static void main(String[] args) {

        Car car = new Car("자동차");
        car.setName("토레스");

        System.out.println("Car object" + car);
        car.type();
        car.select();

        // Vehicle Object
        Vehicle vehicle = car; // "업 캐스팅"

        System.out.println("Car -> Vehicle Upcasting"+ vehicle);
        vehicle.type();
//        vehicle.select(); // error



    }
}
