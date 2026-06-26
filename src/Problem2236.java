public class Problem2236 {
    public static void main(String[] args) {
        System.out.println(checkTree(new TreeNode(10, new TreeNode(4),  new TreeNode(7))));
    }

    public static boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}
