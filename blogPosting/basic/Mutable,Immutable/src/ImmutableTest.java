public class ImmutableTest {
    public void test(){
        String str = "테스트";
        System.out.println(str);
        System.out.println(System.identityHashCode(str));

        str += " 추가문자";
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
    }
}
