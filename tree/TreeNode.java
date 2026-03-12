
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Inorder(root);
    }

    public static void Inorder(TreeNode root) {
        if (root == null)
            return;
        Inorder(root.left);
        System.out.println(root.val);
        Inorder(root.right);

    }

    public static void PreOrder(TreeNode root) {
        if (root == null)
            return;
        System.err.println(root.val);
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void PostOrder(TreeNode root) {
        if (root == null)
            return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.err.println(root.val);
    }

    public static List<List<Integer>> LevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<Integer> q = new LinkedList<>();
        q.add(root.val);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int x = q.poll();
                TreeNode node = new TreeNode(x);
                level.add(node.val);
                if (root.left != null)
                    q.add(root.left.val);
                if (root.right != null)
                    q.add(root.right.val);
            }
            result.add(level);
        }
        return result;
    }

    public static int height(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right) + 1);
    }

    public static int count(TreeNode root) {
        if (root == null)
            return 0;
        return (count(root.left) + count(root.right) + 1);
    }
}
