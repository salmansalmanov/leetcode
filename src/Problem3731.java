import java.util.ArrayList;
import java.util.List;

public class Problem3731 {
    public static void main(String[] args) {
        System.out.println(findMissingElements(new int[]{7,8,6,9}));
    }

    public static List<Integer> findMissingElements(int[] nums) {
        int min = 101;
        int max = 0;
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        for (int i = min; i <= max; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                }
            }
            if (!found) {
                result.add(i);
            }
        }
        return result;
    }
}
