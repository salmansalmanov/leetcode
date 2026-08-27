public class Problem2108 {
    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (word.contentEquals(new StringBuilder(word).reverse())) {
                return word;
            }
        }
        return "";
    }
}
