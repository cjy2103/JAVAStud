import java.util.Arrays;

public class BubbleSort {

    public void sort(){
        int[] array = {50,4,3,20,1,22,43};


        for(int i=1;i<array.length;i++){
            for(int j=0;j<i;j++){
                if(array[i] < array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
//                System.out.println(Arrays.toString(array));
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
