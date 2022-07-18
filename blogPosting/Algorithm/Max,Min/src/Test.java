import java.util.Arrays;

public class Test {

    public void searchMax(int[] array){
        int max = array[0];
        for(int num : array){
            if(max < num){
                max = num;
            }
        }
        System.out.println("최대값 :"+max);
    }

    public void searchMin(int[] array){
        int min = array[0];
        for(int num : array){
            if(min > num){
                min = num;
            }
        }
        System.out.println("최소값 :"+min);
    }

    public void sortCase(int[] array){
        Arrays.sort(array);

        int max = array[array.length-1];
        int min = array[0];
        System.out.println("최대값 :"+max);
        System.out.println("최소값 :"+min);
    }

    public void caseMethod(int[] array){
        int max = array[0];
        int min = array[0];

        for(int num : array){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        System.out.println("최대값 :"+max);
        System.out.println("최소값 :"+min);
    }
}
