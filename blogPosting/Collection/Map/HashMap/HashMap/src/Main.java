import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Car","자동차");
        hashMap.put("People","사람");
        hashMap.put("Book","책");

//        // Map의  Entry 이용
//        for(Map.Entry<String, String> entry :hashMap.entrySet()){
//            System.out.printf(
//                    """
//                    Key: %s, value : %s
//                    """, entry.getKey(), entry.getValue());}
//
//        System.out.println();
//
//        //keySet 이용
//        for(String key : hashMap.keySet()){
//            System.out.printf(
//                    """
//                    key : %s, value : %s
//                    """, key, hashMap.get(key)
//            );
//        }
        Iterator<Map.Entry<String,String>> entryIterator
                                           = hashMap.entrySet().iterator();

        while (entryIterator.hasNext()){
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.printf(
                    """
                    key: %s, value : %s
                    """, entry.getKey(), entry.getValue()
            );
        }

        System.out.println();

        Iterator<String> keys = hashMap.keySet().iterator();

        while (keys.hasNext()){
            String key = keys.next();
            System.out.printf(
                    """
                    key: %s, value : %s
                    """, key, hashMap.get(key)
            );
        }
    }
}