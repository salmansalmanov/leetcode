public class Problem2544 {
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(111));
    }

    public static int alternateDigitSum(int n) {
        int evenSum = 0;
        int oddSum = 0;
        int index = 0;

        while (n > 0) {
            if (index % 2 == 0) {
                oddSum += n % 10;
            } else {
                evenSum += n % 10;
            }
            n /= 10;
            index++;
        }
        if (index % 2 == 0) {
            return evenSum - oddSum;
        }
        return oddSum - evenSum;
    }
}
