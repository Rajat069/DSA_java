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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>>sol = new ArrayList<>();
         if(root==null)return sol;
         Queue<TreeNode>queue= new ArrayDeque();
         queue.add(root);
         Stack<List<Integer>>st= new Stack<>();
         while(!queue.isEmpty()){
             int size=queue.size();
             List<Integer>ar=new ArrayList<>();
             for(int i=0;i<size;i++){
                 TreeNode temp=queue.poll();
                 ar.add(temp.val);
                 if(temp.left!=null)queue.add(temp.left);
                 if(temp.right!=null)queue.add(temp.right);
             }
             st.push(ar);
         }
        while(!st.isEmpty()){
            sol.add(st.pop());
        }
        return sol;
    }
}