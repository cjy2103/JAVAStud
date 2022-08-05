import java.util.Arrays;

public class Test {

    public void shallowCopy(){
        int [] origin = {1,2,3};
        int [] copy = origin;
        System.out.println(Arrays.toString(copy));
    }

    public void deepCopy(){
        int [] origin = {1,2,3};
        int [] copy = new int[origin.length];
        for(int i=0;i<origin.length;i++){
            copy[i] = origin[i];
        }
        System.out.println(Arrays.toString(copy));
    }

    public void objectCopy(){
        int [] origin = {1,2,3};
//        int [] copy = origin.clone();
//        int [] copy = Arrays.copyOf(origin,origin.length);
//        int [] copy = Arrays.copyOfRange(origin,1,2);
        int [] copy = new int[origin.length];
        System.arraycopy(origin,0,copy,0,origin.length);
        System.out.println(Arrays.toString(copy));

    }

    public void multiDimensionalArrayCopy(){
        int [][] origin = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] copy = new int[3][3];

//        for(int i=0;i<origin.length;i++){
//            for(int j=0; j<origin[i].length;j++){
//                copy[i][j] = origin[i][j];
//            }
//        }
        for(int i=0;i<origin.length;i++){
            System.arraycopy(origin[i], 0, copy[i], 0, origin[i].length);
        }
        System.out.println(Arrays.deepToString(copy));

    }
}
