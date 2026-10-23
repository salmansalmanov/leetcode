public class Problem2078 {
    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{1, 1, 1, 6, 1, 1, 1}));
    }

    public static int maxDistance(int[] colors) {
        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }
}
