public class Problem1952 {
    public static void main(String[] args) {
        System.out.println(isThree(4));
    }

    public static boolean isThree(int n) {
        int divisorCount = 2;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                divisorCount++;
            }
        }
        return divisorCount == 3;
    }
}
