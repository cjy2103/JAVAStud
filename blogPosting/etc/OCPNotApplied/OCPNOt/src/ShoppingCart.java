import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public void calculateTotalPrice(){
        double totalPrice = 0;
        for (Product product : products) {
            if (product instanceof Book) {
                totalPrice += product.getPrice() * 0.9;
            } else if (product instanceof Food) {
                totalPrice += product.getPrice() * 1.1;
            } else {
                totalPrice += product.getPrice();
            }
        }
        System.out.println("Total price: " + totalPrice);
    }
}
