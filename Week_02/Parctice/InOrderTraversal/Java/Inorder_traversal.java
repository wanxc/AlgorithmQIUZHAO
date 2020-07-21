package Java.week_2;

import java.util.List;
import java.util.ArrayList;

public class Inorder_traversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode l = new TreeNode(3);
        root.left = l;
        TreeNode r = new TreeNode(4);
        root.right = r;

        List<Integer> list = inorderTraversal(root);
        /*
         * for (Integer integer : list) { System.out.println(integer); }
         */
        System.out.println(list);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }
}