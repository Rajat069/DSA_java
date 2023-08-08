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
    public String smallestFromLeaf(TreeNode root) {
        StringMaker(root,new StringBuilder());
        return sol;
    }
    String sol = "{}";
    private void StringMaker(TreeNode root,StringBuilder cur){
        if(root==null){
           return;
        }
        cur.append((char)(root.val+'a'));
        if(root.left==null&&root.right==null){
            cur.reverse();
            String c = cur.toString();
            cur.reverse();
            if(sol.compareTo(c)>=1){
                sol=c;
            }
        }
        StringMaker(root.left,cur);
        StringMaker(root.right,cur);
        cur.deleteCharAt(cur.length()-1);
    }
}