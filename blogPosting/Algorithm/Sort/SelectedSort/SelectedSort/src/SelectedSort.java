public class SelectedSort {
    /**
     * @DESC: minIndex : 최소값 있는 위치
     * temp : 최소값 저장하기 위한 공간
     * @param array
     * @return
     */
    public int[] sort(int[] array){
        int minIndex, temp;
        //마지막 회차는 할 필요 없음
        for(int i=0;i<array.length-1;i++){
            minIndex = i;
            for(int j=i;j<array.length;j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
