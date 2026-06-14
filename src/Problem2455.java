public class Problem2455 {
    public static void main(String[] args) {
        System.out.println(averageValue(new int[]{1, 3, 10, 15}));
    }

    public static int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            if (num % 6 == 0) {
                sum += num;
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }
}
