import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        ArrayShuffle arrayShuffle = new ArrayShuffle();
//        int[] array = {1,2,3,4,5};
//
//        array = arrayShuffle.randomUse(array);
//
//        System.out.println(Arrays.toString(array));
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Collections.shuffle(arrayList);

        System.out.println(arrayList);

    }
}