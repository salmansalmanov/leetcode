package easy;

public class Problem3010 {
    public static void main(String[] args) {
        System.out.println(minimumCost(new int[]{5, 10, 1, 20}));
    }

    public static int minimumCost(int[] nums) {
        int first = nums[0];
        int n = nums.length;
        int second = 51;
        int third = 51;

        for (int i = 1; i < n; i++) {
            int num = nums[i];
            if (num <= second) {
                third = second;
                second = num;
            } else if (num < third) {
                third = num;
            }
        }
        return first + second + third;
    }
}
