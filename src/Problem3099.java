public class Problem3099 {
    public static void main(String[] args) {
        System.out.println(sumOfTheDigitsOfHarshadNumber(18));
        System.out.println(sumOfTheDigitsOfHarshadNumber(23));
    }

    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        if (x == 100) {
            return 1;
        }
        return x % (x % 10 + x / 10) == 0 ? x % 10 + x / 10 : -1;
    }
}
