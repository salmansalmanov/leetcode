public class Problem3870 {
    public static void main(String[] args) {
        System.out.println(countCommas(1002));
    }

    public static int countCommas(int n) {
        if (n < 1000) {
            return 0;
        }
        return n - 999;
    }
}
