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
    HashMap<Integer,Integer> hm = new HashMap<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        ArrayList<Integer>ar= new ArrayList();
        int maxcount=-1;
        for(int i:hm.keySet()){
            if(hm.get(i)>=maxcount)maxcount=hm.get(i);
        }
         for(int i:hm.keySet()){
            if(hm.get(i)==maxcount)ar.add(i);
        }
        return ar.stream().mapToInt(i -> i).toArray();
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        hm.put(root.val,hm.getOrDefault(root.val,0)+1);
        inorder(root.right);
    }
}