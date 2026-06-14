import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(
                new int[]{7, 2, 11, 15},
                9
        )));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
