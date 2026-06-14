import java.util.Arrays;

public class Problem1337 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kWeakestRows(new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        }, 3)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[][] soldiersAndIndex = new int[mat.length][2];

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            soldiersAndIndex[i][0] = count;
            soldiersAndIndex[i][1] = i;
        }

        Arrays.sort(soldiersAndIndex, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = soldiersAndIndex[i][1];
        }
        return result;
    }
}
