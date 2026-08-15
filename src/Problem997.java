public class Problem997 {
    public static void main(String[] args) {
//        System.out.println(findJudge(2, new int[][]{{1, 2}}));
        System.out.println(findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
    }

    public static int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n + 1];
        for (int[] t : trust) {
            trustCount[t[0]]--;
            trustCount[t[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
