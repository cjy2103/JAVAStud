public class Test {

    public void searchMax(int[] array){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("�ִ밪 :"+max);
    }

    public void searchMin(int[] array){
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("�ּҰ� :"+min);
    }
}
