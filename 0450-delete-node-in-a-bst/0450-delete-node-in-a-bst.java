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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val>key){
            root.left=deleteNode(root.left,key); //receive the returned value to actually delete nodes
        }
        else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.right!=null&&root.left!=null){ //condition one the target node has 2 children here find max out of left subtree then set the current root value to max and run recursive code to delete max (the max will be with no child as with any subtree the max is always a leaf node)
                int max = maxVAL(root.left);
                root.val=max;
                root.left=deleteNode(root.left,max);
                return root;
                
            }//if only right node is there by pass current node and attacj right to parent
            if(root.right!=null){
                return root.right;
            }
            else if(root.left!=null){
                return root.left;
            } // if no child is present attach null
            else{
                return null;
            }
        }
        return root;
    }
    public int maxVAL(TreeNode root){
        if(root.right!=null)return maxVAL(root.right);
        return root.val;
    }
    
}