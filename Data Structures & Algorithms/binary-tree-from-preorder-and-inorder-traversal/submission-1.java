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
    Map<Integer, Integer> map_idx = new HashMap<>();
    int idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder.length == 0 || inorder.length==0 || (preorder.length)!=(inorder.length)) return null;
 
        for(int i=0;i<inorder.length;i++)  map_idx.put(inorder[i], i);

        int n = inorder.length;
        return buildTreeHelper(0, n-1, preorder);
        
    }

    private TreeNode buildTreeHelper(int start, int end, int[] preorder)
    {
        if(start>end) return null;
        TreeNode node = new TreeNode(preorder[idx++]);
        node.left = buildTreeHelper(start, map_idx.get(node.val)-1,preorder);
        node.right = buildTreeHelper(map_idx.get(node.val)+1, end,preorder);
        return node;
        

        
    }
}
