import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayShuffle arrayShuffle = new ArrayShuffle();
        int[] array = {1,2,3,4,5};

        array = arrayShuffle.randomUse(array);

        System.out.println(Arrays.toString(array));
    }
}