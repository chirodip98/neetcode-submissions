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
    int k_smallest = 0;
    int counter=0;
    public int kthSmallest(TreeNode root, int k) {

        if(root == null) return -1;
        getSmallest(root, k);
        return k_smallest;
        
    }

    public void getSmallest(TreeNode root,int k)
    {
        if(root==null) return;
        getSmallest(root.left,k);
        counter+=1;
        if(k==counter) { k_smallest = root.val; return; }
        getSmallest(root.right,k);
        return;
        
    }
}
