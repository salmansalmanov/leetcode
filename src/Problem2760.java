public class Problem2760 {
    public static void main(String[] args) {
        System.out.println(longestAlternatingSubarray(new int[]{3, 2, 5, 4, 4, 5, 6, 7, 8}, 9));
    }

    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > threshold) {
                currentLength = 0;
                continue;
            }

            if (currentLength == 0) {
                if (nums[i] % 2 == 0) {
                    currentLength = 1;
                }
            } else {
                if (nums[i] % 2 != nums[i - 1] % 2) {
                    currentLength++;
                } else {
                    currentLength = (nums[i] % 2 == 0) ? 1 : 0;
                }
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
