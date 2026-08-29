public class Problem2591 {
    public static void main(String[] args) {
        System.out.println(distMoney(20, 3));
    }

    public static int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }

        money -= children;
        int count = money / 7;
        int remainingMoney = money % 7;

        if (count > children) {
            return children - 1;
        }

        if (count == children && remainingMoney > 0) {
            return children - 1;
        }

        if (count == children - 1 && remainingMoney == 3) {
            return count - 1;
        }

        return count;
    }
}
