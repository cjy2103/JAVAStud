

public class QuickSort {

    public int[] leftPivot(int [] array, int left, int right){
        quickSort(array, left, right);
        return array;
    }

    private void quickSort(int[] array, int left, int right){
        if(left >= right) return;

        int pivot = partition(array, left, right);

        quickSort(array, left, pivot - 1);
        quickSort(array, pivot + 1, right);
    }

    private int partition(int[] array, int left, int right){

        int pivot = array[left];

        int i = left;
        int j = right;

        while(i < j) {
            while(pivot < array[j]) {
                j--;
            }
            while(i < j && pivot >= array[i]){
                i++;
            }
            swap(array, i, j);
        }
        array[left] = array[i];
        array[i] = pivot;

        return i;
    }


    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
