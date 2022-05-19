public class Car {
    private String name;
    private int price;

    public Car(){

    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void test(){
        Car car = new Car("스포티지",3500);
        System.out.println("메서드 호출전 : 차이름:"+car.name + " 가격:"+car.price);
//        change(car);
        newChange(car);
        System.out.println("메서드 호출후 : 차이름:"+car.name + " 가격:"+car.price);
    }

    public void change(Car car){
        car.name = "K5";
        car.price = 3200;
        System.out.println("change 메서드 : 차이름:"+car.name + " 가격:"+car.price);
    }

    public void newChange(Car car){
        car = new Car("K5",3200);
        System.out.println("newChange 메서드 : 차이름:"+car.name + " 가격:"+car.price);
    }
}
