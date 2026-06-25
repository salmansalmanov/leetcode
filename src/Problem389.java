import java.util.HashMap;
import java.util.Map;

public class Problem389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("", "y"));
    }

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return (char) map.keySet().toArray()[0];
    }
}
