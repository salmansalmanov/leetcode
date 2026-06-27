public class Problem3856 {
    public static void main(String[] args) {
        System.out.println(trimTrailingVowels("idea"));
    }

    public static String trimTrailingVowels(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                len--;
            } else {
                break;
            }
        }
        return s.substring(0, len);
    }
}
