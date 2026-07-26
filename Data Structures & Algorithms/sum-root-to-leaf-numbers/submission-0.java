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
    int totalSum = 0;
    public int sumNumbers(TreeNode root) {

        if(root==null) return 0;
        helperSum(root, 0);
        return totalSum;
    }

    private int helperSum(TreeNode root, int sum)
    {
        if(root==null) return 0;
        if(root.left ==null && root.right==null) totalSum += sum*10+root.val;
        sum = sum*10 + root.val;
        int left = helperSum(root.left, sum);
        int right = helperSum(root.right, sum);
        return left+right;
    }
}