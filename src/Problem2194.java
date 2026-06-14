import java.util.ArrayList;
import java.util.List;

public class Problem2194 {
    public static void main(String[] args) {
        System.out.println(cellsInRange("A1:F1"));
    }

    public static List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();

        for (char i = s.charAt(0); i <= s.charAt(3); i++) {
            for (char j = s.charAt(1); j <= s.charAt(4); j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(i).append(j);
                result.add(sb.toString());
            }
        }

        return result;
    }
}
