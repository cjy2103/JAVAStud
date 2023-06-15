//구체적 방문자 클래스
public class AnimalSoundVisitor implements AnimalVisitor{

    @Override
    public void visitBeaver(Beaver beaver) {
        System.out.println("비버의 동물 소리: 비버비버");
    }

    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("코끼리 동물 소리: Trumpet!");
    }
}
