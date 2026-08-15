import java.util.Arrays;

public class Problem3668 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(recoverOrder(new int[]{3,1,2,5,4}, new int[]{1, 3, 4})));
    }

    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int index = 0;

        for (int o : order) {
            for (int friend : friends) {
                if (o == friend) {
                    result[index++] = o;
                }
            }
        }
        return result;
    }
}
