public class MutableTest {
    public void test(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("테스트");
        System.out.println(stringBuilder);
        System.out.println(System.identityHashCode(stringBuilder));

        stringBuilder.append(" 추가문자");
        System.out.println(stringBuilder);
        System.out.println(System.identityHashCode(stringBuilder));
    }
}
