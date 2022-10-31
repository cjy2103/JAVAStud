public class InsertionSort {

    public int[] sort(int[] array){

        for(int i=1;i<array.length;i++){
            int key = array[i];
            int aux = i-1;

            while (aux>= 0 && array[aux] > key){
                array[aux+1] = array[aux];
                aux--;
            }

            array[aux +1] = key;
        }
        return array;
    }
}
