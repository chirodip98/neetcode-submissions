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
    List<Integer> rightView = new ArrayList<>();
    int[] visited = new int[101];
    public List<Integer> rightSideView(TreeNode root) {

        int level = 0;
        if(root==null) return rightView;
        helperRightView(root, level);
        return rightView;
    }

    private void helperRightView(TreeNode root, int level)
    {
        if(root==null) return;
        if(visited[level]==0) { rightView.add(root.val); visited[level]=1; }
        helperRightView(root.right, level+1);
        helperRightView(root.left, level+1);
        return;

    }
}
