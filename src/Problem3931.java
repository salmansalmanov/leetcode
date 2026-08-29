public class Problem3931 {
    public static void main(String[] args) {
        System.out.println(isAdjacentDiffAtMostTwo("19"));
    }

    public static boolean isAdjacentDiffAtMostTwo(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) > 2) {
                return false;
            }
        }
        return true;
    }
}
