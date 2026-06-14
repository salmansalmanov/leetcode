public class Problem409 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }

    public static int longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[128];
        int result = 0;
        boolean hasOdd = false;

        for (char c : arr) {
            count[c]++;
        }

        for (int j : count) {
            if (j == 0) {
                continue;
            }
            if (j % 2 == 0) {
                result += j;
            } else {
                result += j - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            result++;
        }
        return result;
    }
}
