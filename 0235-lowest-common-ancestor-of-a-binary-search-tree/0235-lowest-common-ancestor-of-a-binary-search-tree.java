/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();
        searchAndAdd(path1,root,p);
        searchAndAdd(path2,root,q);
        for(int i=path1.size()-1;i>=0;i--){
            if(path2.contains(path1.get(i)))return path1.get(i);
        }
        return null;
    }
    public void searchAndAdd(ArrayList<TreeNode>ar,TreeNode root,TreeNode tar){
        if(root==null||root==tar){
            ar.add(root);
            return;
        }
        ar.add(root);
        if(root.val<tar.val){
            searchAndAdd(ar,root.right,tar); 
        }
        else if(root.val>tar.val){
            searchAndAdd(ar,root.left,tar);
        }
    }
}