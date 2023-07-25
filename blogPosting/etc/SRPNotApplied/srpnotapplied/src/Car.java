public class Car {
    private String model;
    private String color;
    private double price;

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printCarInfo(){
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public void drive(){
        System.out.println("차량 운전중....");
    }

    public void repair(){
        System.out.println("차량 수리중...");
    }
}
