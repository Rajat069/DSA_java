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
    ArrayList<TreeNode>ar = new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root==null)return;
        inorder(root);
        int i=0;
        for(;i<ar.size()-1;i++){
            TreeNode temp = ar.get(i);
            temp.right=ar.get(i+1);
            temp.left=null;
        }
        ar.get(i).right=null;
        ar.get(i).left=null;
        
    }
    public void inorder(TreeNode root){
        if(root==null)return;
        ar.add(root);
        inorder(root.left);
        inorder(root.right);
    }
}