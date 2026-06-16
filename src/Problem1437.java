public class Problem1437 {
    public static void main(String[] args) {
        System.out.println(kLengthApart(
                new int[]{1,0,0,1,0,1}, 2
        ));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int count = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 0) {
                        count++;
                    } else {
                        if (count < k) {
                            return false;
                        }
                        break;
                    }
                }
            }
        }
        return true;
    }
}
