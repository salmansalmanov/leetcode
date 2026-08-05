import java.util.ArrayList;
import java.util.List;

public class Problem1408 {
    public static void main(String[] args) {
        System.out.println(stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
    }

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i]) && !result.contains(words[i])) {
                    result.add(words[i]);
                }
            }
        }
        return result;
    }
}
