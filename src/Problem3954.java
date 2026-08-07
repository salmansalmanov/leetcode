public class Problem3954 {
    public static void main(String[] args) {
        System.out.println(sumOfGoodIntegers(2, 3));
    }

    public static int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        for (int i = Math.max(1, n - k); i <= n + k; i++) {
            if ((n & i) == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
