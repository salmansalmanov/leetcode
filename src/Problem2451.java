import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem2451 {
    public static void main(String[] args) {
//        System.out.println('a' - '0' - 49);
//        System.out.println('b' - '0' - 49);
        System.out.println(oddString(new String[]{"ddd", "poo", "baa", "onn"}));
    }

    public static String oddString(String[] words) {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] letters = word.toCharArray();
            List<Integer> diffList = new ArrayList<>();
            for (int j = 0; j < letters.length - 1; j++) {
                diffList.add(letters[j + 1] - letters[j]);
            }
            if (map.containsKey(diffList)) {
                map.get(diffList).add(word);
            } else {
                List<String> wordList = new ArrayList<>();
                wordList.add(word);
                map.put(diffList, wordList);
            }
        }
        for (List<Integer> key : map.keySet()) {
            if (map.get(key).size() == 1) {
                return map.get(key).getFirst();
            }
        }
        return "";
    }
}
