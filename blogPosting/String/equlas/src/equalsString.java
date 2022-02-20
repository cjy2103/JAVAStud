public class equalsString {
    public static void main(String[] args) {
        String str  = "abc"; // 리터럴을 이용한 변수 초기화
        String str2 = "abc";

        String str3 = new String("abc"); // new 연산자를 이용한 변수 초기화
        String str4 = new String("abc");

        System.out.println(str == str2);
        System.out.println(str.equals(str2));

        System.out.println(str == str3);
        System.out.println(str.equals(str3));

        System.out.println(str == str4);
        System.out.println(str.equals(str4));

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
