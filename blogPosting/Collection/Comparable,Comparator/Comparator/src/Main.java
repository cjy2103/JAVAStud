import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Suv seltos = new Suv("���佺",2800);
//        Suv sportage = new Suv("����Ƽ��",3600);
//
//        if(seltos.compareTo(sportage) > 0){
//            System.out.println(seltos.getName() + "�� " + sportage.getName()+"���� ��Դϴ�");
//        } else if(seltos.compareTo(sportage) < 0){
//            System.out.println(seltos.getName() + "�� " + sportage.getName()+"���� �Դϴ�");
//        } else {
//            System.out.println("�� ���� ������ �����ϴ�");
//        }
//
//        ArrayList<Suv> suvs = new ArrayList<>();
//
//        suvs.add(new Suv("����",3200));
//        suvs.add(new Suv("���佺",2800));
//        suvs.add(new Suv("����Ƽ��",3600));
//        suvs.add(new Suv("�䷹��",3500));
//
//        Collections.sort(suvs);
//
//        Stream<Suv> stream = suvs.stream();
//        stream.forEach(suv->{
//            System.out.println(suv.getName()+"�� ������ "+suv.getPrice());
//        });

//        Sedan avante = new Sedan("�ƹݶ�",2400);
//        Sedan sonata = new Sedan("�ҳ�Ÿ",3000);
//
//        System.out.println("�� ������ ���� ����: "+avante.compare(avante,sonata)+"����");

//        Sedan avante = new Sedan("�ƹݶ�",2400);
//        Sedan sonata = new Sedan("�ҳ�Ÿ",3000);
//
//        Comparator<Sedan> comparator = (o1, o2) -> {
//            if(o1.getPrice() < o2.getPrice()){
//                return o2.getPrice() - o1.getPrice();
//            } else {
//                return o1.getPrice() - o2.getPrice();
//            }
//        };
//
//        System.out.println("�� ������ ���� ����: "+comparator.compare(avante,sonata)+"����");


        ArrayList<Sedan> sedans = new ArrayList<>();
        sedans.add(new Sedan("�ҳ�Ÿ",3000));
        sedans.add(new Sedan("�ƹݶ�",2400));
        sedans.add(new Sedan("k5",3200));
        sedans.add(new Sedan("k3",2300));

        sedans.sort(Comparator.comparingInt(Sedan::getPrice));
        Stream<Sedan> stream = sedans.stream();
        stream.forEach(sedan -> System.out.println(sedan.getName()+"�� ������ "+
                sedan.getPrice()));
    }

}
