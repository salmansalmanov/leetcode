public class Problem1995 {
    public static void main(String[] args) {
        System.out.println(countQuadruplets(new int[]{1, 2, 3, 6}));
    }

    public static int countQuadruplets(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    for (int d = k + 1; d < n; d++) {
                        if (nums[d] == sum) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
