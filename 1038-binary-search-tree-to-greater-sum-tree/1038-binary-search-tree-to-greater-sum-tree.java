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
    int cur=0;
    public TreeNode bstToGst(TreeNode root) {
        if(root==null){
            return null;
        }
        Gst(root);
        return root;
    }
    private void Gst(TreeNode root){
        if(root==null){
            return;
        }
        Gst(root.right);
        cur+=root.val;
        root.val=cur;
        Gst(root.left);
    }
}