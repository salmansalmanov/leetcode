public class Problem2843 {
    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1200, 1230));
    }

    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 != 0) {
                continue;
            }
            int mid = s.length() / 2;
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < mid; j++) {
                leftSum += s.charAt(j) - '0';
                rightSum += s.charAt(j + mid) - '0';
            }
            if (leftSum == rightSum) {
                count++;
            }
        }
        return count;
    }
}
