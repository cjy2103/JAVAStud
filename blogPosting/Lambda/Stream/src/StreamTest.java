import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
    }

    public void streamTest(){
        ArrayList<String> seasonList = new ArrayList<>(
                Arrays.asList("봄", "여름", "가을", "겨울"));

        Stream<String> stream = seasonList.stream();

        stream.forEach(season -> System.out.println("계절:"+season));
    }
}
