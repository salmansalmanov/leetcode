package easy;

public class Problem1869 {
    public static void main(String[] args) {
        System.out.println(checkZeroOnes("110100010"));
    }

    public static boolean checkZeroOnes(String s) {
        int ones = 0;
        int zeros = 0;
        int max1 = 0;
        int max0 = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeros++;
                ones = 0;
                max0 = Math.max(zeros, max0);
            } else {
                ones++;
                zeros = 0;
                max1 = Math.max(ones, max1);
            }
        }
        return max1 > max0;
    }
}
