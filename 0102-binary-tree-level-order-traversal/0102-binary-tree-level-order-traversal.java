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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> sol = new ArrayList<>();
        if(root==null)return sol;
        Queue<TreeNode> orderQ = new ArrayDeque();
        orderQ.add(root);
        while(orderQ.size()>0){
            ArrayList<Integer>temp = new ArrayList<>();
            int size=orderQ.size();
            int q=0;
            while(q<size){
                TreeNode t = orderQ.poll();
                temp.add(t.val);
                if(t.left!=null){
                    orderQ.add(t.left);
                }
                if(t.right!=null){
                    orderQ.add(t.right);
                }
               q++;
            }
            sol.add(temp);
        }
        return sol;
    }
}