public class CarBluePrint implements Produce {
    @Override
    public Car sonata() {
        return new Car();
    }

    @Override
    public Car tucson() {
        return new Car();
    }
}
