import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {7,6,2,4,1,5,8,3};
        SelectedSort sort = new SelectedSort();
        array = sort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}