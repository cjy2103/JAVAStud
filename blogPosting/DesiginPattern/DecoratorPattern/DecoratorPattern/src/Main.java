public class Main {
    public static void main(String[] args) {

        // 기본 물건 생성
        Product basicProduct = new BasicProduct(100, "Basic Product");

        // 추가 기능을 가진 데코레이터 적용
        Product discountedProduct = new DiscountedProduct(basicProduct, 20);

        System.out.println("Price: "+discountedProduct.getPrice());
        System.out.println("Description: "+discountedProduct.getDescription());

    }
}