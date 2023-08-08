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
    public String smallestFromLeaf(TreeNode root) {
        StringMaker(root,(char)(root.val+'a')+"");
        return sol;
    }
    String sol = "{}";
    private void StringMaker(TreeNode root,String cur){
        if(root==null){
           return;
        }
        if(root.left==null&&root.right==null){
            StringBuilder sb = new StringBuilder(cur);
            sb.reverse();
            String c = sb.toString();
            if(sol.compareTo(c)>=1){
                sol=c;
            }
            return;
        }
        if(root.left!=null)StringMaker(root.left,cur+((char)(root.left.val+'a')));
        if(root.right!=null)StringMaker(root.right,cur+((char)(root.right.val+'a')));
    }
}