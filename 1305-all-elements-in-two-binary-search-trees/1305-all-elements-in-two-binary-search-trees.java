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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        add(mp,root1);
        add(mp,root2);
        ArrayList<Integer> sol = new ArrayList<>();
        for(int key:mp.keySet()){
            int val= mp.get(key);
            for(int i=0;i<val;i++)sol.add(key);
        }
        return sol;
    }
    public void add(TreeMap hm,TreeNode root1){
         if(root1==null){
             return;
         } 
         add(hm,root1.left);
         hm.put(root1.val, (int) hm.getOrDefault(root1.val, 0) + 1);
         add(hm,root1.right);
    }
}