import java.util.ArrayList;

public class ListTest {

    public void listTest(){
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.set(2,5);

        System.out.println(arrayList);

    }
}
