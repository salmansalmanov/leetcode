public class Problem3194 {
    public static void main(String[] args) {
        System.out.println(minimumAverage(new int[]{7, 8, 3, 4, 15, 13, 4, 1}));
    }

    public static double minimumAverage(int[] nums) {
        int n = nums.length / 2;
        double[] averages = new double[n];
        int index = 0;

        while (n > 0) {
            int min = 51;
            int max = -1;
            int indexOfMin = -1;
            int indexOfMax = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min && nums[i] > 0) {
                    min = nums[i];
                    indexOfMin = i;
                }
                if (nums[i] > max && nums[i] > 0) {
                    max = nums[i];
                    indexOfMax = i;
                }
            }
            nums[indexOfMin] = -1;
            nums[indexOfMax] = -1;
            averages[index] = (double) (min + max) / 2;
            n--;
            index++;
        }
        double minAverage = averages[0];
        for (int i = 1; i < averages.length; i++) {
            if (averages[i] < minAverage) {
                minAverage = averages[i];
            }
        }
        return minAverage;
    }
}
