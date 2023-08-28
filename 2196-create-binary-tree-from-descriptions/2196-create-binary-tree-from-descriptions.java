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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode>hm = new HashMap<>();
        for(int ar[]:descriptions){
            hm.put(ar[1],new TreeNode(ar[1]));
        }
        TreeNode parent=null;
        for(int ar[]:descriptions){
            if(hm.containsKey(ar[0])){
                if(ar[2]==1){
                    hm.get(ar[0]).left=hm.get(ar[1]);
                }
                else{
                    hm.get(ar[0]).right=hm.get(ar[1]);
                }
            }
            else{
                TreeNode p=new TreeNode(ar[0]);
                parent=p;
                if(ar[2]==1){
                    p.left=hm.get(ar[1]);
                }
                else{
                    p.right=hm.get(ar[1]);
                }
                hm.put(ar[0],p);
            }
        }
        return parent;
    }
}