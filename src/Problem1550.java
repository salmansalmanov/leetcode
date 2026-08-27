public class Problem1550 {
    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int row = 0;
        for (int n : arr) {
            if (n % 2 == 1) {
                row++;
            } else {
                row = 0;
            }
            if (row == 3) {
                return true;
            }
        }
        return false;
    }
}
