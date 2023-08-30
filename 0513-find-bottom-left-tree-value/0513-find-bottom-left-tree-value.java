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
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null&&root.right==null)return root.val;
        int val=-1;
        Queue<TreeNode>queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                  TreeNode temp = queue.poll();
                  if(i==0)val=temp.val;
                  if(temp.left!=null){
                      queue.offer(temp.left);
                  }
                  if(temp.right!=null){
                      queue.offer(temp.right);
                  }
            }
        }
        return val;
    }
}