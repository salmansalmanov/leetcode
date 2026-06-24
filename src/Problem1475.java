import java.util.Arrays;

public class Problem1475 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(
                new int[]{10, 1, 1, 6}
        )));
    }

    public static int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[i] = prices[i];
            }
        }
        return result;
    }
}
