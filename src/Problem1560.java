import java.util.ArrayList;
import java.util.List;

public class Problem1560 {
    public static void main(String[] args) {
        System.out.println(mostVisited(7, new int[]{1, 3, 5, 7}));
    }

    public static List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int end = rounds[rounds.length - 1];
        List<Integer> result = new ArrayList<>();

        if (start <= end) {
            for (int i = start; i <= end; i++) {
                result.add(i);
            }
        } else {
            for (int i = 1; i <= end; i++) {
                result.add(i);
            }
            for (int i = start; i <= n; i++) {
                result.add(i);
            }
        }
        return result;
    }
}
