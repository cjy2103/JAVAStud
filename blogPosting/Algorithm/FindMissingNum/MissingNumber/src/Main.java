public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000000];
        for (int i = 0; i < 54321; i++) {
            arr[i] = i + 1;
        }
        for (int i = 54322; i < arr.length; i++) {
            arr[i] = i;
        }
        int result = findMissingNumber(arr);
        System.out.println("빠진 숫자: " + result);
    }


    static int findMissingNumber(int[] arr){
        int result = 0;

        // 모든 배열 요소와 인덱스에 대해 XOR 연산을 수행
        for (int i = 0; i < arr.length; i++) {
            result ^= i ^ arr[i];
        }

        // 배열의 길이만큼 XOR 연산을 수행하여 빠진 값 찾기
        result ^= arr.length;

        return result;
    }
}