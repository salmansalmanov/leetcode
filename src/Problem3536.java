public class Problem3536 {
    public static void main(String[] args) {
        System.out.println(maxProduct(123));
        System.out.println(maxProduct(999));
    }

    public static int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        while (n > 0) {
            int r = n % 10;
            if (r > max) {
                secondMax = max;
                max = r;
            } else if (r > secondMax) {
                secondMax = r;
            }
            n /= 10;
        }
        return max * secondMax;
    }
}
