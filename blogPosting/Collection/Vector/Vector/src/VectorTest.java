import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Stream;

public class VectorTest {

    public void intVector(){
        Vector<Integer> vector = new Vector<>();
        vector.add(3);
        vector.add(null); // null add 강능
        vector.add(0,10); // 0번째 위치에 10 삽입

        Stream<Integer> stream = vector.stream();
        stream.forEach(num -> System.out.println("숫자: "+num));
        System.out.println();
    }

    public void objectVector(){
        Vector<Car> vector = new Vector<>();
        Car car = new Car("투싼",3200);

        vector.add(new Car("스포티지",3500));
        vector.add(car);

        Stream<Car> stream = vector.stream();
        stream.forEach(item -> System.out.println("차 이름:"+item.getName()));
        System.out.println();
    }

    public void removeTest(){
        Vector<Integer> vector = new Vector<>(Arrays.asList(1,2,3,4,5));
        vector.remove(3); // index 3번째 값 제거
//        vector.removeAllElements(); // 모든 값 제거
//        vector.clear(); // 모든 값 제거

        Stream<Integer> stream = vector.stream();
        stream.forEach(item -> System.out.println("요소:"+item));
        System.out.println();
    }

    public void vectorSize(){
        Vector<Integer> vector = new Vector<>(10);
        vector.add(10);
        System.out.println("Vector 자료개수:"+vector.size()); // Vector 자료 개수
        System.out.println("Vector 물리적 크기:"+vector.capacity()); // Vector 물리적 크기
    }

    public void printVector(){
        Vector<Integer> vector = new Vector<>(Arrays.asList(1,2,3,4,5));

        // 기본 for문
        for(int i=0;i<vector.size();i++){
            System.out.println(vector.get(i));
        }

        // forEach 문
        for(Integer num : vector){
            System.out.println(num);
        }

        //Iterator 사용
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Stream 사용
        Stream<Integer> stream = vector.stream();
        stream.forEach(System.out::println);
    }
}
