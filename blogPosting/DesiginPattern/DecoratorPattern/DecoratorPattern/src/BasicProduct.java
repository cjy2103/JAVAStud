// Concrete Component : 실제 물건을 나타내는 클래스
public class BasicProduct implements Product{

    private int price;
    private String description;

    public BasicProduct(int price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
