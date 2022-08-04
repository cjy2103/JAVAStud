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
        int [] copy = origin.clone();
        System.out.println(Arrays.toString(copy));


    }

}
