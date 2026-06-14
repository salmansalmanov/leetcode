import java.util.HashSet;
import java.util.Set;

public class Problem3483 {
    public static void main(String[] args) {
        System.out.println(totalNumbers(new int[]{1, 2, 3, 4}));
    }

    public static int totalNumbers(int[] digits) {
        Set<Integer> validNumbers = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k) {
                        if (digits[i] != 0) {
                            if (digits[k] % 2 == 0) {
                                int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                                validNumbers.add(number);
                            }
                        }
                    }
                }
            }
        }

        return validNumbers.size();
    }
}
