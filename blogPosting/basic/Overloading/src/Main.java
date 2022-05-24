public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.test(3,5);
        test.test("책",2000);
        test.test("같은 이름의 여러개의 메서드를 가져도 "
                , "시그니처만 다르면 문제없이 작동합니다.");
    }
}
