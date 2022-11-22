public class Tucson extends Car implements Produce{
    @Override
    public Car newCar() {
        return new Tucson();
    }
}
