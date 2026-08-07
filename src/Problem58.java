public class Problem58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();
    }
}
