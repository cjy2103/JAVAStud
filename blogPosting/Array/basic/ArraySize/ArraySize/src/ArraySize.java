import java.util.Arrays;

public class ArraySize {

    public void arraySize(){
        int[] emptyArr = new int[3];

        try {
            for (int i = 0; i < 5; i++) {
                emptyArr[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            emptyArr = new int[emptyArr.length*2];

            System.out.println(Arrays.toString(emptyArr));

            for (int i = 0; i < 5; i++) {
                emptyArr[i] = i;
            }
        }

        System.out.println(Arrays.toString(emptyArr));

    }
}
