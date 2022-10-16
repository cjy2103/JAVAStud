import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] originArr = {1,2,3,4,5};
        int[] copyArr = originArr.clone();

//        ArrayCopy arrayCopy = new ArrayCopy();
//
//        copyArr = arrayCopy.arrayCopy(originArr);
//
//        System.arraycopy(originArr, 0, copyArr, 0, originArr.length);

        System.out.println(Arrays.toString(copyArr));



    }
}
