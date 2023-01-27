import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,8,7,2,3,4,1};

        QuickSort quickSort = new QuickSort();
        array = quickSort.leftPivot(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}