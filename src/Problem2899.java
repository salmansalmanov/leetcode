import java.util.ArrayList;
import java.util.List;

public class Problem2899 {
    public static void main(String[] args) {
        System.out.println(lastVisitedIntegers(new int[]{1, -1, 2, -1, -1}));
    }

    public static List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int k = 0;

        for (int num : nums) {
            if (num > 0) {
                k = 0;
                seen.add(num);
            } else {
                k++;
                if (k <= seen.size()) {
                    ans.add(seen.reversed().get(k - 1));
                } else {
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}
