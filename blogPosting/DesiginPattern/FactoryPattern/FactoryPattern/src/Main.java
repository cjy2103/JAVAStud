public class Main {
    public static void main(String[] args) {
        // 팩토리 생성
        ProductFactory factory = new BookFactory();

        // 물건 생성
        Product product = factory.createProduct();

        // 물건 판매
        product.sell();
    }
}