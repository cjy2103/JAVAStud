public class Sonata extends Car implements Produce{
    @Override
    public Car newCar() {
        return new Sonata();
    }
}
