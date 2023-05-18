// 구체적 제품 : 책
public class Book implements Product{
    @Override
    public void sell() {
        System.out.println("책 판매");
    }
}
