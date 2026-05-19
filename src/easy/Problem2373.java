package easy;

public class Problem2373 {
    public static void main(String[] args) {
//        int[][] arr = new int[][]{
//                {9, 9, 8, 1},
//                {5, 6, 2, 6},
//                {8, 2, 6, 4},
//                {6, 2, 2, 2}
//        };
        int[][] arr = new int[][]{
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        print(largestLocal(arr));
    }

    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = 0;
                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {
                        max = Math.max(max, grid[r][c]);
                    }
                }
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;
    }

    public static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
