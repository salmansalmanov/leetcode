public class Problem2114 {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{
                "please wait", "continue to fight", "continue to win"
        }));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            max = Math.max(findWords(sentence), max);
        }
        return max;
    }

    public static int findWords(String sentence) {
        int wordCount = 1;
        for (int j = 0; j < sentence.length(); j++) {
            if (sentence.charAt(j) == ' ') {
                wordCount++;
            }
        }
        return wordCount;
    }
}
