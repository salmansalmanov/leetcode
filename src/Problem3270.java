public class Problem3270 {
    public static void main(String[] args) {
        System.out.println(generateKey(282, 718, 1028));
    }

    public static int generateKey(int num1, int num2, int num3) {
        String s1 = String.format("%04d", num1);
        String s2 = String.format("%04d", num2);
        String s3 = String.format("%04d", num3);
        StringBuilder key = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int a = s1.charAt(i) - '0';
            int b = s2.charAt(i) - '0';
            int c = s3.charAt(i) - '0';

            key.append(Math.min(Math.min(a, b), c));
        }
        return Integer.parseInt(key.toString());
    }
}
