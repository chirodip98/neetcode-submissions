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
    public int goodNodes(TreeNode root) {

        if (root == null) return 0;
        int maxSeen = Integer.MIN_VALUE;
        return helper(root, maxSeen);
    }

    private int helper(TreeNode root, int max)
    {
        if(root==null) return 0;

        int count = 0;
        if(root.val >= max) {count+=1; max=Math.max(root.val, max);}
        
        count+= helper(root.left, max);
        count+= helper(root.right, max);
        
        return count;
    }
}
