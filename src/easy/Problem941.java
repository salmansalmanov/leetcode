package easy;

public class Problem941 {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0, 3, 2, 1}));
    }

    public static boolean validMountainArray(int[] arr) {
        int i = 1;
        int n = arr.length;

        while (i < n && arr[i] > arr[i - 1]) {
            i++;
        }
        if (i == 1 || i == n) {
            return false;
        }
        while (i < n && arr[i] < arr[i - 1]) {
            i++;
        }
        return i == n;
    }
}
