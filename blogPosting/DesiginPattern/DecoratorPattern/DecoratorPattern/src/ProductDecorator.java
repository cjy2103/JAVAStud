// Decorator : 물건의 추가 기능을 나타내는 추상 클래스
public abstract class ProductDecorator implements Product {
    protected Product decoratedProduct;

    public ProductDecorator(Product decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }

    @Override
    public int getPrice() {
        return decoratedProduct.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedProduct.getDescription();
    }
}
