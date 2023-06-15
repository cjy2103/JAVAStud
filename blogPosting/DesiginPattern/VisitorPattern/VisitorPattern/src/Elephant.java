// 구체적 요소 클래스
public class Elephant implements Animal{
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitElephant(this);
    }
}
