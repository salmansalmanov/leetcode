package easy;

public class Problem2432 {
    public static void main(String[] args) {
        System.out.println(hardestWorker(2, new int[][]{
                {0,10},{1,20}
        }));
    }

    public static int hardestWorker(int n, int[][] logs) {
        int maxTime = -1;
        int start = 0;
        int employee = -1;

        for (int[] log : logs) {
            int id = log[0];
            int endTime = log[1];
            int duration = endTime - start;

            if (duration > maxTime || (duration == maxTime && id < employee)) {
                maxTime = duration;
                employee = id;
            }

            start = endTime;
        }
        return employee;
    }
}
