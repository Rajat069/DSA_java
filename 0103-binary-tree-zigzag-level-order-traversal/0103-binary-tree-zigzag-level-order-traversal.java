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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         Queue<TreeNode> queue = new ArrayDeque();
         List<List<Integer>> sol = new ArrayList<>();
         if(root==null)return sol;
         queue.add(root);
         int idx=0;
         while(!queue.isEmpty()){
             int size=queue.size();
             Stack<Integer>rev= new Stack<>();
             List<Integer>ar=new ArrayList<>();
             for(int i=0;i<size;i++){
                 TreeNode temp = queue.poll();
                 if(idx%2==1)rev.push(temp.val);
                 else ar.add(temp.val);
                 if(temp.left!=null)queue.add(temp.left);
                 if(temp.right!=null)queue.add(temp.right);
             }
             if(idx%2==1){
                 while(!rev.isEmpty()){
                     ar.add(rev.pop());
                 }
             }
             sol.add(ar);
             idx++;
         }
        return sol;
    }
}