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
    public int diameterOfBinaryTree(TreeNode root) {
        return dfs(root).diameter;
    }

    // DP state class
    private static class Result {
        int height;
        int diameter;
        Result(int h, int d) {
            height = h;
            diameter = d;
        }
    }

    private Result dfs(TreeNode node) {
        if (node == null) return new Result(0, 0);

        Result left = dfs(node.left);
        Result right = dfs(node.right);

        int height = 1 + Math.max(left.height, right.height);
        int diameter = Math.max(
            left.diameter,
            Math.max(right.diameter, left.height + right.height)
        );

        return new Result(height, diameter);
    }
}

