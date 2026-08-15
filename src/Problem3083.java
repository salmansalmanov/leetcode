public class Problem3083 {
    public static void main(String[] args) {
        System.out.println(isSubstringPresent("ausoee"));
    }

    public static boolean isSubstringPresent(String s) {
        String reversed = new StringBuilder(s).reverse().toString();

        for (int i = 0; i <= s.length() - 2; i++) {
            String piece = s.substring(i, i + 2);
            if (s.contains(piece) && reversed.contains(piece)) {
                return true;
            }
        }
        return false;
    }
}
