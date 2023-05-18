// 구체적인 팩토리 : 책 팩토리
public class BookFactory implements ProductFactory{

    @Override
    public Product createProduct() {
        return new Book();
    }
}
