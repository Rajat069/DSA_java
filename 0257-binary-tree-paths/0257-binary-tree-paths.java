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
    private List<String> sol = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,"");
        return sol;
    }
    private void helper(TreeNode root,String cur){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            cur+=root.val;
            sol.add(cur);
            return;
        }
        if(root.left!=null){
            helper(root.left,cur+root.val+"->");
        }
        if(root.right!=null){
            helper(root.right,cur+root.val+"->");
        }
    }
}
