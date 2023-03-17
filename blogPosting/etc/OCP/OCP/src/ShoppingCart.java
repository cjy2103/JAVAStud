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
            totalPrice += product.calculatePrice();
        }
        System.out.println("Total price: " + totalPrice);
    }
}
