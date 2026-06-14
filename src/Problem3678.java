public class Problem3678 {
    public static void main(String[] args) {
        System.out.println(smallestAbsent(new int[]{3, 5}));
    }

    public static int smallestAbsent(int[] nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double avg = sum / nums.length;
        int count = 1;
        while (true) {
            if (count > avg) {
                boolean found = false;
                for (int num : nums) {
                    if (num == count) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    return count;
                }
            }
            count++;
        }
    }
}
