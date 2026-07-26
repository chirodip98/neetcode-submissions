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
    List<Integer> inOrder = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return inOrder;
        helperInOrder(root);    
        return inOrder;    
    }

    private void helperInOrder(TreeNode root)
    {
        if(root==null) return;
        helperInOrder(root.left);
        inOrder.add(root.val);
        helperInOrder(root.right);
        return;

    }
}