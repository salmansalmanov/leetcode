package easy;

public class Problem2609 {
    public static void main(String[] args) {
        System.out.println(findTheLongestBalancedSubstring("01000111"));
    }

    public static int findTheLongestBalancedSubstring(String s) {
        if (!s.contains("0") || !s.contains("1")) {
            return 0;
        }

        int zeros = 0;
        int ones = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (ones > 0) {
                    zeros = 0;
                    ones = 0;
                }
                zeros++;
            } else {
                ones++;

                maxLen = Math.max(maxLen, Math.min(zeros, ones) * 2);
            }
        }
        return maxLen;
    }
}
