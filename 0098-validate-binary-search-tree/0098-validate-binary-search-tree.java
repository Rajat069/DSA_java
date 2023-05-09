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
    ArrayList<Integer>ar = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for(int i=1;i<ar.size();i++){
            if(ar.get(i)<=ar.get(i-1))return false;
        }
        return true;
        
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        ar.add(root.val);
        inorder(root.right);
    }
}