public class Problem1742 {
    public static void main(String[] args) {
        System.out.println(countBalls(1, 100_000));
    }

    public static int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        int max = 0;

        for (int i = lowLimit; i < highLimit + 1; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            arr[sum]++;

            if (arr[sum] > max) {
                max = arr[sum];
            }
        }
        return max;
    }
}
