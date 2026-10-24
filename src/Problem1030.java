import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1030 {
    public static void main(String[] args) {
        int[][] result = allCellsDistOrder(2, 3, 1, 2);
        for (int[] cell : result) {
            System.out.println(Arrays.toString(cell));
        }
    }

    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Map<int[], Integer> cells = new HashMap<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int[] cell = {r, c};
                int distance = Math.abs(r - rCenter) + Math.abs(c - cCenter);
                cells.put(cell, distance);
            }
        }
        return cells.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .toArray(int[][]::new);
    }
}
