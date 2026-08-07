public class Problem3146 {
    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc", "bac"));
        System.out.println(findPermutationDifference("abcde", "edbac"));
    }

    public static int findPermutationDifference(String s, String t) {
        int result = 0;
        for (char c : s.toCharArray()) {
            result += Math.abs(s.indexOf(c) - t.indexOf(c));
        }
        return result;
    }
}
