// 구체적 요소 클래스
public class Beaver implements Animal{
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitBeaver(this);
    }
}
