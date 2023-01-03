import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str = "123456";
        Integer i = 1;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        HashMap<String,String> hashMap = new HashMap<>(){{put("Book","Java기초");}};

        HashMap<String, Integer> map = new HashMap<>();

        map.put("key", 12345);

        System.out.println(str.getClass().getTypeName());
        System.out.println(i.getClass().getTypeName());
        System.out.println(list.getClass().getTypeName());
        System.out.println(hashMap.getClass().getTypeName());
        System.out.println(map.getClass().getTypeName());


    }
}
