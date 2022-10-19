import java.util.LinkedList;
import java.util.List;

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
            System.out.println("차량:"+car.getName()+", 가격:"+car.getPrice());
        }

    }

    public void linkedListRemove(){
        LinkedList<Integer> list = new LinkedList<>(List.of(1,2,3,4,5,6,7,8));

        System.out.println("삭제전");
        System.out.println(list);

        list.removeFirst(); // 맨앞 데이터 삭제
        list.removeLast(); // 맨뒤 데이터 삭제
        list.remove(); // 0번째 index 제거
        list.remove(3); // 3번째 index 제거

        System.out.println("삭제후");
        System.out.println(list);

    }

    public void linkedListSize(){
        LinkedList<Integer> list = new LinkedList<>(List.of(1,2,3,4,5,6,7,8));
        System.out.println(list.size());
    }

    public void linkedListValue(){
        LinkedList<Integer> list = new LinkedList<>(List.of(1,2,3,4,5,6,7,8));

        System.out.println(list.get(2)); // 2번째 index 출력
        
        for(int i : list){
            System.out.println(i);
        }
    }

    public void linkedListSearch(){
        LinkedList<Integer> list = new LinkedList<>(List.of(1,2,3,4,5,6,7,8));
        System.out.println(list.contains(3)); // list에 3의 값이 있는지 확인 (있다면 true)
        System.out.println(list.indexOf(3)); // list에 3이 있는 위치를 반환 없다면 -1 반환
    }
}
