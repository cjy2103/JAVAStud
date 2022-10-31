import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] origin = {5,7,2,4,1,6,8,3};

        InsertionSort insertionSort = new InsertionSort();

        int[] sort = insertionSort.sort(origin);

        System.out.println(Arrays.toString(sort));

    }
}
