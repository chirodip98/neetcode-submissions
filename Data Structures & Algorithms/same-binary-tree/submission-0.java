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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return helperSameTree(p,q);
        
    }

    private boolean helperSameTree(TreeNode p, TreeNode q)
    {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return (p.val == q.val) && helperSameTree(p.left, q.left) && helperSameTree(p.right, q.right);
    }
}
