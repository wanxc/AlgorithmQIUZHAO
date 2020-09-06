package Java.week_2;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
public class InOrderTraversal1 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        TreeNode l=new TreeNode(2);
        root.left=l;
        TreeNode r=new TreeNode(1);
        root.right=r;
        List<Integer> list=inOrderTraversal(root);
        System.out.println(list);
    }
    public static List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        while(curr!=null||!stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;
    }
}