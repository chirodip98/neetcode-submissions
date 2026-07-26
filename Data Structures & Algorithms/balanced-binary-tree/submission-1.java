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

    boolean isBalanced=true;
    private int height(TreeNode root)
    {
        if(root==null) return -1;
        int left = height(root.left);
        int right = height(root.right);
        isBalanced  = isBalanced && Math.abs((left-right)) <=1;
        return 1 + Math.max(left, right);
    }
    public boolean isBalanced(TreeNode root) {

        height(root);
        return isBalanced;
        
    }
}
