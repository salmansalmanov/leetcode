import java.util.ArrayList;
import java.util.List;

public class Problem1431 {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = 0;
        for (int candy : candies) {
            maxCandy = Math.max(maxCandy, candy);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandy);
        }
        return result;
    }
}
