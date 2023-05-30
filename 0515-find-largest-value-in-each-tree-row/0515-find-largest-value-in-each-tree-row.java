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
    public List<Integer> largestValues(TreeNode root) {
        return LevelOrdMaxVal(root);
    }
    public List<Integer>LevelOrdMaxVal(TreeNode root){
        List<Integer>sol = new ArrayList<>();
        if(root==null)return sol;
        Queue<TreeNode>queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                if(temp.left!=null)queue.add(temp.left);
                if(temp.right!=null)queue.add(temp.right);
                max=Math.max(max,temp.val);
            }
            sol.add(max);
        }
        return sol;
    }
}