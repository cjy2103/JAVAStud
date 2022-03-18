public class Main {
    public static void main(String[] args) {
        String str = "hello my friends";

        System.out.println(str.contains("hello"));
        System.out.println(str.contains("friends"));
        System.out.println(str.contains(" friends"));
        System.out.println(str.contains(" hello"));
        System.out.println(str.contains("my"));
        System.out.println(str.contains(" my "));
        
    }
}
