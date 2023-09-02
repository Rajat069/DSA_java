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
    int sum=0;
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null)return 0;
        if(root.val%2==0){
            helper(root.left);
            helper(root.right);
        }
        sumEvenGrandparent(root.left);
        sumEvenGrandparent(root.right);
        return sum;
    }
    private void helper(TreeNode root){
        if(root==null)return;
        if(root.left!=null){
            sum+=root.left.val;
        }
        if(root.right!=null){
            sum+=root.right.val;
        }
    }
}