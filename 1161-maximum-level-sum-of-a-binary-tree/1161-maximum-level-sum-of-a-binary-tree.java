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
    public int maxLevelSum(TreeNode root) {
          int max=Integer.MIN_VALUE,level=0,sollevel=0;
          Queue<TreeNode>queue = new ArrayDeque();
          queue.add(root);
          while(!queue.isEmpty()){
              int size=queue.size(),sum=0,idx=0;
              while(idx<size){
                  TreeNode temp = queue.poll();
                  sum+=temp.val;
                  if(temp.left!=null)queue.add(temp.left);
                  if(temp.right!=null)queue.add(temp.right);
                  idx++;
              }
              
              level++;
              if(max<sum){
                  max=sum;
                  sollevel=level;
              }
          }
        return sollevel;
    }
}