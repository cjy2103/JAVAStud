import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10,5,2,4,6,2,1,45,7};
        Sort sort = new Sort();
        int sortArray[] = sort.cocktailSort(array);
        System.out.println(Arrays.toString(sortArray));
    }
}