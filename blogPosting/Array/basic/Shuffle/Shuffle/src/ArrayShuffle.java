import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class ArrayShuffle {

    public Array[] randomUse(Array[] array){
        Random random = new Random();

        for(int i=0;i<array.length;i++){
            int value = (int)(Math.random() * array.length);
            
        }

        return array;
    }
}
