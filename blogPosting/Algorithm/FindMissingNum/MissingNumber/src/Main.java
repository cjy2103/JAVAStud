public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 10, 1, 6, 7, 5, 8 ,2, 9,11,13,12,14,15};
        int missingNumber = findMissingNumber(numbers);
        System.out.println("빠진 숫자는: " + missingNumber);
    }
    static int findMissingNumber(int[] arr){
        int n = arr.length + 1;
        int xorResult = 0;

        // 1부터 n까지의 숫자를 XOR 연산
        for (int i = 1; i <= n; i++) {
            xorResult ^= i;
        }

        // 주어진 숫자들에 대해서도 XOR 연산
        for (int num : arr) {
            xorResult ^= num;
        }

        return xorResult;
    }
}