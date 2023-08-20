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
    int maxD=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        helper(root);
        return maxD;
    }
    private int helper(TreeNode root){
        if(root==null)return 0;
        int lc=0,rc=0;
        if(root.left!=null){
            lc=helper(root.left);
        }
        if(root.right!=null){
            rc=helper(root.right);
        }
        maxD=Math.max(maxD,lc+rc);
        return Math.max(rc,lc)+1;
    }
}