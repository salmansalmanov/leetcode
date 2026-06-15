public class Problem3120 {
    public static void main(String[] args) {
        System.out.println(numberOfSpecialChars("abc"));
    }

    public static int numberOfSpecialChars(String word) {
        int[] lowers = new int[26];
        int[] uppers = new int[26];

        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                lowers[word.charAt(i) - 'a']++;
            } else {
                uppers[word.charAt(i) - 'A']++;
            }
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lowers[i] != 0 && uppers[i] != 0) {
                count++;
            }
        }
        return count;
    }
}
