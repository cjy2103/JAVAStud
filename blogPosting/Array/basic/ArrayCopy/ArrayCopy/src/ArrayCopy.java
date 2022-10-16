import java.util.Arrays;

public class ArrayCopy {
    public int[] arrayCopy(int[] originArr){
        int[] copyArr = new int[originArr.length];

        for(int i=0;i<originArr.length;i++){
            copyArr[i] = originArr[i];
        }
        return copyArr;
    }

}
