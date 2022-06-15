import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5};

        int i=0;
        for(int num : array){
            System.out.println(num);
            if(array[i] == 3){
                array[i] = 2;
            }
            i++;
        }

        System.out.println(Arrays.toString(array));

    }
}



