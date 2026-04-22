package easy;

public class Problem3300 {
    public static void main(String[] args) {
        System.out.println(minElement(new int[]{999, 19, 999}));
    }

    public static int minElement(int[] nums) {
        int min = 36;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            while (nums[i] > 0) {
                sum += nums[i] % 10;
                nums[i] /= 10;
            }
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }
}
