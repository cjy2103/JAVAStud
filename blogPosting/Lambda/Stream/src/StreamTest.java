import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public void interatorTest(){
        ArrayList<String> seasonList = new ArrayList<>(
                Arrays.asList("봄", "여름", "가을", "겨울"));

        Iterator<String> iterator = seasonList.iterator();

        while (iterator.hasNext()){
            String season = iterator.next();
            System.out.println("계절:"+season);
        }
        System.out.println();
    }

    public void streamTest(){
        ArrayList<String> seasonList = new ArrayList<>(
                Arrays.asList("봄", "여름", "가을", "겨울"));

        Stream<String> stream = seasonList.stream();

        stream.forEach(season -> System.out.println("계절:"+season));
        System.out.println();
    }

    public void streamTest2(){
        String[] strArray = {"월","화","수","목","금","토","일"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(day -> System.out.println(day+"요일"));
        System.out.println();

        int[] array = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(array);
        intStream.forEach(num -> System.out.println("숫자:"+num));
        System.out.println();
    }

    public void streamTest3(){
        ArrayList<Car> carArrayList = new ArrayList<>(Arrays.asList(
                  new Car("스포티지",3600)
                , new Car("토레스",3200)
                , new Car("투싼",3400)
            )
        );

        Stream<Car> stream = carArrayList.stream();
        stream.forEach(car -> System.out.println("차이름:" + car.getName()));
    }
}
