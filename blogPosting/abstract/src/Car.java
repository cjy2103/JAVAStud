public class Car extends Vehicle{
    private String name;
    private int price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    void showInfo(){
        System.out.println("차량이름 :"+name+" 가격:"+price+"만원");
    }
}
