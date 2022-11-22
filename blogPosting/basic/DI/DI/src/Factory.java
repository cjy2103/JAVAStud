public class Factory{
//    private Worker worker = new Worker(new Sonata());
//
//    public void changeCar(){
//        worker = new Worker(new Tucson());
//    }
    private Worker worker = new Worker();

    public void changeCar(){
        worker.setProduce(new Tucson());
    }
}
