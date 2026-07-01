import java.util.HashMap;
import java.util.Map;

public class Problem3396 {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{6,7,8,9}));
    }

    public static int minimumOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        boolean isOne = true;
        for (int num : map.values()) {
            if (num != 1) {
                isOne = false;
                break;
            }
        }
        if (isOne) {
            return 0;
        } else {
            if (nums.length == 2 || nums.length == 3 || nums.length == 4) {
                return 1;
            }
        }

        int start = 3;
        int result = 1;

        while (start < nums.length) {
            boolean equals = false;
            for (int i = start; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        equals = true;
                        break;
                    }
                }
            }
            if (!equals) {
                break;
            }
            start += 3;
            result++;
        }
        return result;
    }
}
