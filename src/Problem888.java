import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem888 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1, 1}, new int[]{2, 2})));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;

        for (int size : aliceSizes) {
            sumAlice += size;
        }

        for (int size : bobSizes) {
            sumBob += size;
        }

        int target = (sumBob - sumAlice) / 2;
        Set<Integer> setBob = new HashSet<>();
        for (int size : bobSizes) {
            setBob.add(size);
        }

        for (int size : aliceSizes) {
            if (setBob.contains(size + target)) {
                return new int[]{size, size + target};
            }
        }

        return new int[0];
    }
}
