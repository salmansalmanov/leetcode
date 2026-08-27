public class Problem2778 {
    public static void main(String[] args) {
        System.out.println(sumOfSquares(new int[]{1, 2, 3, 4}));
    }

    public static int sumOfSquares(int[] nums) {
        int result = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                result += nums[i] * nums[i];
            }
        }
        return result;
    }
}
