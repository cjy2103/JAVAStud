public class Main {
    public static void main(String[] args) {
        int currentPrice;
        StringBuilder currentCar;
        Sedan sedan = new Sedan();
        sedan.setName(new StringBuilder("소나타"));
        sedan.setPrice(3400);
        currentPrice = sedan.getPrice();
        currentCar = sedan.getName();
        System.out.println("현재 자동차:"+currentCar);
        System.out.println("현재 가격: "+currentPrice);

        Suv suv = new Suv();
        suv.name = new StringBuilder("스포티지");
        suv.price = 3800;

        System.out.println("현재 자동차:" + suv.name);
        System.out.println("현재 가격 : "+ suv.price);
    }
}
