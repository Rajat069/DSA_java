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
    int maxZigZag=-1;
    public int longestZigZag(TreeNode root) {
        if(root==null)return 0;
        helper(root,'*',0);
        return maxZigZag;
    }
    private void helper(TreeNode root, char dir, int dis) {
        if (root == null) {
            return;
        }
        maxZigZag=Math.max(maxZigZag,dis);
        if(dir == '*') {
            helper(root.left, 'L', 1);
            helper(root.right, 'R', 1);
        }else if (dir == 'L') {
            helper(root.right, 'R', dis + 1);
            helper(root.left, 'L', 1);
        }else if (dir == 'R') {
            helper(root.left, 'L', dis + 1);
            helper(root.right, 'R', 1);
        }
    }
}