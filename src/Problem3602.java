public class Problem3602 {
    public static void main(String[] args) {

    }

    public static String concatHex36(int n) {
        String toHex = Integer.toHexString(n * n).toUpperCase();
        String to36 = Integer.toString(n * n * n, 36).toUpperCase();
        return toHex + to36;
    }
}
