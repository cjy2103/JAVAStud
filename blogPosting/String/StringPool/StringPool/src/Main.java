public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello").intern();

        if(str1 == str2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}