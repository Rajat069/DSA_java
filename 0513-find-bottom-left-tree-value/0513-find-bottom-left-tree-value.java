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
    int leftM;
    int Glevel=0;
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null&&root.right==null){
            return root.val;
        }
        DFS(root,0);
        return leftM;
    }
    private void DFS(TreeNode root,int level){
       if(root==null)return;
       if(level>Glevel){
           leftM=root.val;
           Glevel=level;
       }
       if(root.left!=null)DFS(root.left,level+1);
       if(root.right!=null)DFS(root.right,level+1); 
    }
}