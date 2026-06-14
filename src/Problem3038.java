public class Problem3038 {
    public static void main(String[] args) {
        System.out.println(isSubstringPresent("ausoee"));
    }

    public static boolean isSubstringPresent(String s) {
        if (s.length() < 2) {
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        int n = s.length() - 1;
        for (int i = 0; i < n; i++) {
            String piece = s.substring(i, i + 2);
            if (reversed.lastIndexOf(piece) != -1) {
                return true;
            }
        }
        return false;
    }
}
