public class StoogeSort {
    public void stoogeSort(int[] arr, int start, int end){
        if(arr[start] > arr[end]){
            swap(arr, start, end);
        }

        if(end - start + 1 > 2){
            int third = (end - start + 1) / 3;

            stoogeSort(arr, start, end - third);
            stoogeSort(arr, start + third, end);
            stoogeSort(arr, start, end - third);
        }
    }

    private void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
