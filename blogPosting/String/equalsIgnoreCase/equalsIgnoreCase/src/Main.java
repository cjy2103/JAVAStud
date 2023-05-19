public class Main {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "HELLO";

        if(str.equals(str2)){
            System.out.println("equals 사용 : 같다");
        } else {
            System.out.println("equals 사용 : 다르다");
        }

        if(str.equalsIgnoreCase(str2)){
            System.out.println("equalsIgnoreCase 사용 : 같다");
        } else {
            System.out.println("equalsIgnoreCase 사용 : 같다");
        }
    }
}