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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        helper(root,0,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;
    }
    private void helper(TreeNode root,long cur,long tar){
        if(root==null){
            return;
        }
        cur+=root.val;
        if(cur==tar){
            count++;
        }
        helper(root.left,cur,tar);
        helper(root.right,cur,tar);
    }
}