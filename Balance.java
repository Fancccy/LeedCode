class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
    }
public class Balance {
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return left>right?(left+1):(right+1);
    }
    public boolean isBalance(TreeNode root) {
        // 检查二叉树是否平衡   树中任意一个节点两棵子树的高度差不超过1
        if(root==null){
            return true;
        }
       return Math.abs(height(root.left)-height(root.right))<=1&&isBalance(root.left)&&isBalance(root.right);
    }

}
