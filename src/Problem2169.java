public class Problem2169 {
    public static void main(String[] args) {
        System.out.println(countOperations(10, 10));
    }

    public static int countOperations(int num1, int num2) {
        int operations = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            operations++;
        }
        return operations;
    }
}
