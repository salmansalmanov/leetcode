import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3697 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                decimalRepresentation(102)
        ));
    }

    public static int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        int place = 1;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                list.add(digit * place);
            }
            n = n / 10;
            place *= 10;
        }

        int[] result = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            result[list.size() - i - 1] = list.get(i);
        }
        return result;
    }
}
