import java.util.LinkedList;

public class LinkedListTest {
    public void linkedList(){
        LinkedList<Integer> list = new LinkedList<Integer>(); // 타입설정 int만 가능

        list.add(2);
        list.addFirst(1);
        list.addLast(4);
        list.add(2,3);

        LinkedList<Car> carList = new LinkedList<>(); // Car 타입 설정

        carList.add(new Car("스포티지",3400));
        carList.add(new Car("투싼",3300));
        carList.add(new Car("토레스",3200));

        System.out.println(list);

        for(Car car : carList){
            
        }

    }
}
