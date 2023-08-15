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
    private int count=0;
    public int goodNodes(TreeNode root){
        if(root==null)return 0;
        helper(root,root.val);
        return count;
    }
    private void helper(TreeNode root,int max){
        if(root==null){
            return;
        }
        if(root.val>=max){
            count++;
            max=Math.max(max,root.val);
        }
        if(root.left!=null)helper(root.left,max);
        if(root.right!=null)helper(root.right,max);
    }
}