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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       return (leafVSeq(root1,new StringBuilder()).toString()).equals((leafVSeq(root2,new StringBuilder())).toString());
    }
    private StringBuilder leafVSeq(TreeNode root,StringBuilder temp){
        if(root==null){
            return new StringBuilder();
        }
        if(isLeaf(root)){
            temp.append(root.val+"*");
            return temp;
        }
        if(root.left!=null)leafVSeq(root.left,temp);
        if(root.right!=null)leafVSeq(root.right,temp);
        return temp;
    }
    private boolean isLeaf(TreeNode root){
        return root.left==null&&root.right==null;
    }
}