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
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root==null) return false;
        return helperPath(root, targetSum, 0);
        
    }

    private boolean helperPath(TreeNode root, int target, int sum)
    {
        if(root == null) return false;
        if(root.left==null && root.right==null) return target == sum+root.val;
        return helperPath(root.right, target, sum+root.val) || helperPath(root.left, target, sum+root.val);
    }
}