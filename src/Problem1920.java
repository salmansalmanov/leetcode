import java.util.Arrays;

public class Problem1920 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[]{5,0,1,2,3,4})));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
