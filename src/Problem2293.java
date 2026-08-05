public class Problem2293 {
    public static void main(String[] args) {
        System.out.println(minMaxGame(new int[]{1,3,5,2,4,8,2,2}));
    }

    public static int minMaxGame(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n / 2];

        while (n > 1) {
            for (int i = 0; i < nums.length / 2; i++) {
                if (i % 2 == 0) {
                    newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            n /= 2;
            nums = newNums;
        }

        return nums[0];
    }
}
