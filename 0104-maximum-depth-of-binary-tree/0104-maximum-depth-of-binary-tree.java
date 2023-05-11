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
    public int maxDepth(TreeNode root) {
        return lvOrd(root);
    }
    public int lvOrd(TreeNode root){
        if(root==null)return 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        int depth=0;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int idx=0;
            while(idx<size){
                TreeNode temp = q.poll();
                if(temp.right!=null)q.add(temp.right);
                if(temp.left!=null)q.add(temp.left);
                idx++;
            }
            depth++;
        }
        return depth;
    }
}