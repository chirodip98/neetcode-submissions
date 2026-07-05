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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> traverse = new ArrayList<>();
        Queue<TreeNode> Q = new LinkedList<>();

        if(root==null) return traverse;
        Q.offer(root);
        while(!Q.isEmpty())
        {
            int size = Q.size();
            List<Integer> ans = new ArrayList<>();
            for(int i=0; i<size; i++)
            {
                 TreeNode top = Q.poll();
                 ans.add(top.val);
                if(top.left!=null) Q.offer(top.left);
                if(top.right!=null) Q.offer(top.right);
            }
            traverse.add(ans);
        }
        
        return traverse;
    }
}
