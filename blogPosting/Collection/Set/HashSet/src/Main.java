import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("봄");
        hashSet.add("여름");
        hashSet.add("가을");
        hashSet.add("겨울");

        System.out.println(hashSet);

        System.out.println("HashSet 크기:"+hashSet.size());

        hashSet.remove("봄");
        System.out.println(hashSet);

        System.out.println(hashSet.contains("봄"));
        System.out.println(hashSet.contains("여름"));

        System.out.println(hashSet.isEmpty());

        hashSet.clear();
        System.out.println(hashSet);
    }
}