public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Book("컴퓨터 구조",3000));
        shoppingCart.addProduct(new Food("삼겹살",20000));

        shoppingCart.calculateTotalPrice();
    }
}