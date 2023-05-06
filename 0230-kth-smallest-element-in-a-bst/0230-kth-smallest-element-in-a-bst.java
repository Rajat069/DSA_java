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
    public ArrayList<Integer> ar = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        helper(root); 
        return ar.get(k-1);
    }
   
    public void helper(TreeNode root){
         if(root==null)return;
         int idx=0;
         helper(root.left);
         ar.add(root.val);
         helper(root.right);
    }
}