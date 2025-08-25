import javax.swing.tree.TreeNode;

public class BT_3_Max_Depth {
    public int maxDepth(TreeNode root) {
        
        if(root == null) return 0;

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
