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
        helper(root,new StringBuilder());
        return sol;
    }
    private void helper(TreeNode root,StringBuilder sb){
        if(root==null){
            return;
        }
        int len = sb.length();
        sb.append(root.val);
        if(root.left==null&&root.right==null){
            sol.add(sb.toString());
        }
        else{
             sb.append("->");
             helper(root.left,sb);
             helper(root.right,sb);   
        }
        sb.setLength(len);
    }
}
