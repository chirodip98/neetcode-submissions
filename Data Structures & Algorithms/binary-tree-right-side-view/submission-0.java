/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) {\ this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> rightView = new ArrayList<>();
        if(root==null) return rightView;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.offer(root);

        while(!Q.isEmpty())
        {
            int size = Q.size();
            for(int i=0; i<size; i++)
            {
                TreeNode top = Q.poll();
                if(i == 0) rightView.add(top.val);
                if(top.right!=null) Q.offer(top.right);
                if(top.left!=null) Q.offer(top.left);
            }
        }

        return rightView;
        
    }
}