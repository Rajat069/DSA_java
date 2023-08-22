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
//Method 2
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
            if(root.right!=null&&root.left!=null){ //condition one the target node has 2 children here find min out of right subtree then set the current root value to min and run recursive code to delete min (the min will be with no child as with any subtree the min is always a leaf node)
                int min = minVAL(root.right);
                root.val=min;
                root.right=deleteNode(root.right,min);
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
    public int minVAL(TreeNode root){
        if(root.left!=null)return minVAL(root.left);
        return root.val;
    }
    
}