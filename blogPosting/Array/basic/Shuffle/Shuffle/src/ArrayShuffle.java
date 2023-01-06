
public class ArrayShuffle {

    public int[] randomUse(int[] array){
        for(int i=0;i<array.length;i++){
            int value = (int)(Math.random() * array.length);
            int temp = array[i];
            array[i] = array[value];
            array[value] = temp;
        }

        return array;
    }
}
