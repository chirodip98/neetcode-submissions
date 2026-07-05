/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        
        if(root==null) return true;
        int leftSubtree = heightOfTree(root.left);
        int rightSubtree = heightOfTree(root.right);
        return Math.abs(rightSubtree - leftSubtree) <=1 && (isBalanced(root.left) && isBalanced(root.right));

    }

    public int heightOfTree(TreeNode root)
    {
        if(root==null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        return 1 + Math.max(left, right);
    }
}
