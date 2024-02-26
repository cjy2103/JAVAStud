import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute(nums);
    }

    private static void permute(int[] nums) {
        backtrack(nums, new ArrayList<>(),new boolean[nums.length]);
    }

    private static void backtrack(int[] nums, ArrayList<Integer> current , boolean[] used) {
        if (current.size() == nums.length) {
            System.out.println(current); // 해를 찾았을 때 처리
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            current.add(nums[i]);
            used[i] = true;

            backtrack(nums, current, used);

            current.removeLast();
            used[i] = false;
        }

    }
}