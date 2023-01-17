import java.util.Arrays;

public class Sort {

    public int[] cocktailSort(int[] arr){
        int first = 0;
        int last = arr.length-1;
        boolean swap = true;
        while (first < last && swap){
            swap = false;
            for(int i=first;i<last;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap = true;
                }
            }
            System.out.println("1.정방향 정렬"+Arrays.toString(arr));
            last--;
            if(swap){
                swap = false;
                for(int i= last; i>first;i--){
                    if(arr[i] < arr[i-1]){
                        int temp = arr[i];
                        arr[i] = arr[i-1];
                        arr[i-1] = temp;
                        swap = true;
                    }
                }
            }
            first++;
            System.out.println("2.역방향 정렬"+Arrays.toString(arr));
            System.out.println(swap);

        }
        return arr;
    }
}
