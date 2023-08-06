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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        if(root.left==null&&root.right==null)return root.val==targetSum;
        helper(root,targetSum,root.val);
        return flag;
    }
    boolean flag=false;
    public void helper(TreeNode root,int tar,int cur){
        if(root==null)return;
        if(root.left==null&&root.right==null&&tar==cur){
            flag=true;
            return;
        }
        if(root.left!=null)helper(root.left,tar,cur+root.left.val);
        if(root.right!=null)helper(root.right,tar,cur+root.right.val);

    }
}