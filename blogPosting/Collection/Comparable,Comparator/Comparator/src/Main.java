import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Suv seltos = new Suv("셀토스",2800);
//        Suv sportage = new Suv("스포티지",3600);
//
//        if(seltos.compareTo(sportage) > 0){
//            System.out.println(seltos.getName() + "가 " + sportage.getName()+"보다 비쌉니다");
//        } else if(seltos.compareTo(sportage) < 0){
//            System.out.println(seltos.getName() + "가 " + sportage.getName()+"보다 쌉니다");
//        } else {
//            System.out.println("두 차량 가격이 같습니다");
//        }
//
//        ArrayList<Suv> suvs = new ArrayList<>();
//
//        suvs.add(new Suv("투싼",3200));
//        suvs.add(new Suv("셀토스",2800));
//        suvs.add(new Suv("스포티지",3600));
//        suvs.add(new Suv("토레스",3500));
//
//        Collections.sort(suvs);
//
//        Stream<Suv> stream = suvs.stream();
//        stream.forEach(suv->{
//            System.out.println(suv.getName()+"의 가격은 "+suv.getPrice());
//        });

//        Sedan avante = new Sedan("아반떼",2400);
//        Sedan sonata = new Sedan("소나타",3000);
//
//        System.out.println("두 차량의 가격 차이: "+avante.compare(avante,sonata)+"만원");

//        Sedan avante = new Sedan("아반떼",2400);
//        Sedan sonata = new Sedan("소나타",3000);
//
//        Comparator<Sedan> comparator = (o1, o2) -> {
//            if(o1.getPrice() < o2.getPrice()){
//                return o2.getPrice() - o1.getPrice();
//            } else {
//                return o1.getPrice() - o2.getPrice();
//            }
//        };
//
//        System.out.println("두 차량의 가격 차이: "+comparator.compare(avante,sonata)+"만원");


        ArrayList<Sedan> sedans = new ArrayList<>();
        sedans.add(new Sedan("소나타",3000));
        sedans.add(new Sedan("아반떼",2400));
        sedans.add(new Sedan("k5",3200));
        sedans.add(new Sedan("k3",2300));

        sedans.sort(Comparator.comparingInt(Sedan::getPrice));
        Stream<Sedan> stream = sedans.stream();
        stream.forEach(sedan -> System.out.println(sedan.getName()+"의 가격은 "+
                sedan.getPrice()));
    }

}
