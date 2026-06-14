public class Problem1413 {
    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{1, 2, 3}));
    }

    public static int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;

        for (int num : nums) {
            sum += num;
            minSum = Math.min(minSum, sum);
        }
        return 1 - minSum;
    }
}
