public class Problem2520 {
    public static void main(String[] args) {
        System.out.println(countDigits(1248));
    }

    public static int countDigits(int num) {
        int temp = num;
        int count = 0;

        while (temp > 0) {
            if (num % (temp % 10) == 0) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }
}
