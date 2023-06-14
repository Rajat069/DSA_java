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
    int minDif=Integer.MAX_VALUE,pre;
    public int getMinimumDifference(TreeNode root) {
        pre=root.val;
        inorder(root);
        return minDif;
    }
    public void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        if(Math.abs(root.val-pre)<minDif&&pre!=root.val){
            minDif=Math.abs(root.val-pre);
        }
        pre=root.val;
        inorder(root.right);
    }
}