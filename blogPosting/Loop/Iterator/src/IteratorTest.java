import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    public void test(){
        System.out.println("ArrayList ����");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("��");
        arrayList.add("����");
        arrayList.add("����");
        arrayList.add("�ܿ�");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String season = (String) iterator.next();
            if(season.equals("����")){
                iterator.remove();
            }
            System.out.println("����:"+season);
        }

        System.out.println("------- remove ���� --------");
        iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String season = (String) iterator.next();
            System.out.println("����:"+season);
        }
    }

}
