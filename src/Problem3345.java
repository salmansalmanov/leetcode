public class Problem3345 {
    public static void main(String[] args) {
        System.out.println(smallestNumber(10, 6));
    }

    public static int smallestNumber(int n, int t) {
        String nString = String.valueOf(n);
        if (nString.contains("0")) {
            return n;
        }

        int product = 1;
        for (int i = n; i < 101; i++) {
            char[] digits = String.valueOf(i).toCharArray();
            for (char digit : digits) {
                product *= (digit - '0');
            }
            if (product % t == 0) {
                return i;
            } else {
                product = 1;
            }
        }
        return -1;
    }
}
