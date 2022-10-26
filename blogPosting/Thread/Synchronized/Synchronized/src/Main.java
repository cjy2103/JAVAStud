public class Main {
    public static void main(String[] args) {
        String[] array = {"동해물과","백두산이","마르고 닮도록","하느님이","보우하사","우리나라만세","무궁화","삼천리","화려강산","대한사람","대한으로","길이보전하세"};
        for (int i = 0; i < array.length; i++) {  // 총 10개의 쓰레드를 생성하여 실행한다.
            Thread t = new ThreadTest(i,array);
            t.start();
        }
//        System.out.println("main end.");  // main 메소드 종료
//        ThreadTest threadTest = new ThreadTest();
//        threadTest.thread();
    }
}