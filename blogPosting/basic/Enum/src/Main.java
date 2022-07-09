public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        test.session = Season.여름;
        test.date = Week.토;

        System.out.println("현재 계절은? :"+ test.session);
        System.out.println("오늘의 요일은? :"+test.date);
    }
}
