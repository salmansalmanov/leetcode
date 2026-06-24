public class Problem693 {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(7));
    }

    public static boolean hasAlternatingBits(int n) {
        while (n > 0) {
            int first = n % 2;
            int second = n / 2 % 2;
            if (first == second) {
                return false;
            }
            n = n / 4;
        }
        return true;
    }
}
