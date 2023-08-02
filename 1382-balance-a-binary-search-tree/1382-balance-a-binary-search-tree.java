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
    public TreeNode balanceBST(TreeNode root) {
        if(root==null)return root;
        inorder(root);
        TreeNode balBST = null;
        int f=0,l=ar.size()-1;
        return helper(f,l);
        
    }
    private TreeNode helper(int low,int high){
        if(low>high)return null;
        int mid = low+(high-low)/2;
        TreeNode node = new TreeNode(ar.get(mid));
        node.left=helper(low,mid-1);
        node.right=helper(mid+1,high);
        return node;
    }
    private TreeNode createBST(TreeNode root,int val){
        if(root==null)return new TreeNode(val);
        if(val>root.val){
            root.right=createBST(root.right,val);
        }
        else{
            root.left=createBST(root.left,val);
        }
        return root;
    }
    ArrayList<Integer> ar = new ArrayList<>();
    private void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        ar.add(root.val);
        inorder(root.right);
    }
}