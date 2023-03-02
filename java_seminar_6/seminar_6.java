package java_seminar_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class seminar_6 {

    public static void main(String[] args) {
        TreeNode tNode = new TreeNode(1, new TreeNode(null), new TreeNode(2, new TreeNode(null), new TreeNode(3)));
        List<Integer> treeOrder = preorderTraversal(tNode);
        System.out.println(treeOrder);

    }

    public static class TreeNode {
        Integer val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(Integer val) {
            this.val = val;
        }

        TreeNode(Integer val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val != null)
                list.add(node.val);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
        return list;
    }
}