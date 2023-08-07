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
    public int sumNumbers(TreeNode root) {
        if(root==null)return 0;
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        CalculateNum(root,sb);
        return DigSum;
    }
    private int DigSum=0;
    private void CalculateNum(TreeNode root,StringBuilder sb){
      if(root==null){
          return;
      }
      if(isLeaf(root)){
          DigSum+=(Integer.parseInt(sb.toString()));
          return;
      }  
      if(root.left!=null){
          sb.append(root.left.val);
          CalculateNum(root.left,sb);
          sb.deleteCharAt(sb.length()-1);
      } 
      if(root.right!=null){
          sb.append(root.right.val);
          CalculateNum(root.right,sb);
          sb.deleteCharAt(sb.length()-1);
      } 
    }
    private boolean isLeaf(TreeNode root){
        return root!=null&&root.left==null&&root.right==null;
    }
}