import java.util.Arrays;

public class Problem3379 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructTransformedArray(
                new int[]{3,-2,1,1}
        )));
    }

    public static int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int index = (i + nums[i]) % n;

            if (index < 0) {
                index += n;
            }

            result[i] = nums[index];
        }
        return result;
    }
}
