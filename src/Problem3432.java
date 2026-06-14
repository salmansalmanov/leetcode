public class Problem3432 {
    public static void main(String[] args) {
        System.out.println(countPartitions(new int[]{10, 10, 3, 7, 6}));
        System.out.println(countPartitions(new int[]{2, 4, 6, 8}));
        System.out.println(countPartitions(new int[]{1, 2, 2}));
    }

    public static int countPartitions(int[] nums) {
        int result = 0;
        int start = 1;
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        while (n - start > 0) {
            int rightSum = 0;
            for (int i = start; i < n; i++) {
                rightSum += nums[i];
            }
            int leftSum = sum - rightSum;

            if ((rightSum % 2 == 0 && leftSum % 2 == 0) || (rightSum % 2 == 1 && leftSum % 2 == 1)) {
                result++;
            }
            start++;
        }
        return result;
    }
}
