public class Main {
    public static void main(String[] args) {
        int currentPrice;
        StringBuilder currentCar;
        Sedan sedan = new Sedan();
        sedan.setName(new StringBuilder("�ҳ�Ÿ"));
        sedan.setPrice(3400);
        currentPrice = sedan.getPrice();
        currentCar = sedan.getName();
        System.out.println("���� �ڵ���:"+currentCar);
        System.out.println("���� ����: "+currentPrice);

        Suv suv = new Suv();
        suv.name = new StringBuilder("����Ƽ��");
        suv.price = 3800;

        System.out.println("���� �ڵ���:" + suv.name);
        System.out.println("���� ���� : "+ suv.price);
    }
}
