public class Main {
    public static void main(String[] args) {
//        final Test test = new Test();
//        test = new Test(); // final 키워드로 객체 생성하면 재생성 불가능
//        test.setName("값 수정");
//        test.print();

        final Test2 test2 = new Test2();
        test2.setName("이름 변경 테스트");
        test2.print();
    }
}
