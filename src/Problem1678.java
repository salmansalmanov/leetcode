public class Problem1678 {
    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        char[] commandChars = command.toCharArray();
        int n = commandChars.length;

        for (int i = 0; i < n; i++) {
            if (commandChars[i] == 'G') {
                result.append("G");
            } else if (commandChars[i] == '(' && commandChars[i + 1] == ')') {
                result.append("o");
                i++;
            } else {
                result.append("al");
                i += 3;
            }
        }
        return result.toString();
    }
}
