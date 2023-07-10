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
   public int minDepth(TreeNode root) {
    if (root == null) {
        return 0;
    }
    
    // If either left or right child is null, return the non-null child's minimum depth
    if (root.left == null) {
        return minDepth(root.right) + 1;
    }
    if (root.right == null) {
        return minDepth(root.left) + 1;
    }
    
    // If both left and right children exist, return the minimum of their depths
    return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
}

}