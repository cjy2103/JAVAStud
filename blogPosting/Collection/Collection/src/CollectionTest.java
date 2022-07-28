import java.util.ArrayList;

public class CollectionTest {

    public void araayListCase(){
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        for(int num : arrayList){
            System.out.println(num);
        }
    }


}
