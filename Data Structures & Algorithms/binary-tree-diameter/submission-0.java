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
    int diameter = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {

        if(root==null) return 0;
        helperDiameter(root);
        return diameter;
    }

    private int helperDiameter(TreeNode root)
    {
        if(root==null) return 0;
        int left = helperDiameter(root.left);
        int right = helperDiameter(root.right);
        diameter = Math.max(diameter, left+right);
        return 1 + Math.max(left,right);
    }
}
