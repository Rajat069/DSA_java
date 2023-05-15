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
    ArrayList<Integer>ar= new ArrayList<>();
    int idx=0;
    public void recoverTree(TreeNode root) {
        inorder(root);
        Collections.sort(ar);
        traversal(root);
    }
    public void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        ar.add(root.val);
        inorder(root.right);
    }
    public void traversal(TreeNode root){
        if(root==null)return;
        traversal(root.left);
        if(root.val!=ar.get(idx)){
            root.val=ar.get(idx);
        }
        idx++;
        traversal(root.right);
    }
}