import java.util.Arrays;
public class BinarySearch {
    public int search(int[] arr, int target){

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length-1;
        int count = 0;

        while (left <= right){
            int mid = (left + right) / 2;
            count++;

            if(arr[mid] == target){
                return count;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // 타겟이 배열에 존재하지 않을 경우 -1 반환
    }
}
