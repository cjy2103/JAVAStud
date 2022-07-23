import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    public void test(){
        System.out.println("ArrayList 생성");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("봄");
        arrayList.add("여름");
        arrayList.add("가을");
        arrayList.add("겨울");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String season = (String) iterator.next();
            if(season.equals("여름")){
                iterator.remove();
            }
            System.out.println("계절:"+season);
        }

        System.out.println("------- remove 이후 --------");
        iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String season = (String) iterator.next();
            System.out.println("계절:"+season);
        }
    }

}
