import java.util.*;

public class Problem1207 {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Integer> seen = new HashSet<>();
        for (int i : map.values()) {
            if (seen.contains(i)) {
                return false;
            }
            seen.add(i);
        }
        return true;
    }
}
