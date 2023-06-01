// Concrete Decorator : 물건에 추가적인 기능을 제공하는 클래스
public class DiscountedProduct extends ProductDecorator{
    private int discount;

    public DiscountedProduct(Product decoratedProduct, int discount) {
        super(decoratedProduct);
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        int originPrice = super.getPrice();
        int discountPrice = originPrice - discount;
        return Math.max(discountPrice, 0);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "(Discounted)";
    }
}
