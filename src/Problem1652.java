import java.util.Arrays;

public class Problem1652 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decrypt(
                new int[]{5, 7, 1, 4}, 0
        )));
    }

    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
                result[i] = sum;
            }
        } else if (k < 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= Math.abs(k); j++) {
                    sum += code[(i - j + n) % n];
                }
                result[i] = sum;
            }
        }
        return result;
    }
}
