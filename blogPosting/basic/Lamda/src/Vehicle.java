public class Vehicle {

    public void speedCheck(Speed speed){
        String overSpeed = speed.overSpeed(1,150);
        System.out.println("해당차량은 "+overSpeed);
    }
}
