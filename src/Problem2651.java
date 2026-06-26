public class Problem2651 {
    public static void main(String[] args) {
        System.out.println(findDelayedArrivalTime(15, 5));
        System.out.println(findDelayedArrivalTime(13, 11));
    }

    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time = arrivalTime + delayedTime;
        if (time < 24) {
            return time;
        } else if (time == 24) {
            return 0;
        } else {
            return time - 24;
        }
    }
}
