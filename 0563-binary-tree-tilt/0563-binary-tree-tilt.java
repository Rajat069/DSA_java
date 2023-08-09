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
    public int findTilt(TreeNode root) {
        return TiltHelper(root);
    }
    public int TiltHelper(TreeNode root){
        if(root==null){
            return 0;
        }
        int lsum = NodeSum(root.left);
        int rsum = NodeSum(root.right);
        
        int tilt = Math.abs(lsum-rsum);
        int ltilt = TiltHelper(root.left);
        int rtilt = TiltHelper(root.right);
        return tilt+rtilt+ltilt;
    }
    private int NodeSum(TreeNode root){
        if(root==null)return 0;
        return root.val+NodeSum(root.left)+NodeSum(root.right);
    }
}