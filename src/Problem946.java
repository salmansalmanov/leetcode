import java.util.Arrays;

public class Problem946 {
    public static void main(String[] args) {
        System.out.println(largestPerimeter(
                new int[]{2, 1, 2}
        ));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = n - 1; i >= 2; i--) {
            int a = nums[i - 2];
            int b = nums[i - 1];
            int c = nums[i];

            if (a + b > c) {
                return a + b + c;
            }
        }
        return 0;
    }
}
