import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 6, 1, 3, 9, 4, 7};
        System.out.println("Original array: " + Arrays.toString(arr));

        StoogeSort stoogeSort = new StoogeSort();

        stoogeSort.stoogeSort(arr, 0 , arr.length-1);

        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}