import java.util.HashSet;
import java.util.Set;

public class Problem2441 {
    public static void main(String[] args) {
        System.out.println(findMaxK(new int[]{-1,2,-3,3}));
    }

    public static int findMaxK(int[] nums) {
        int result = -1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (set.contains(-num)) {
                result = Math.max(result, num);
            }
        }
        return result;
    }
}
