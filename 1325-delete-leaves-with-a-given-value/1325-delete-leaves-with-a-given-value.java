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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
       if(root==null)return null;
       if(root.left!=null)root.left=removeLeafNodes(root.left,target);
       if(root.right!=null)root.right=removeLeafNodes(root.right,target);
       return root.left==null&&root.right==null&&target==root.val?null:root;
    }
}