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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null)return false;
        Queue<TreeNode>queue = new ArrayDeque<>();
        queue.offer(root);
        int idx=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            int prev=-1;
            for(int i=0;i<size;i++){
            TreeNode temp = queue.poll();
            if(prev!=-1){
                    if(idx%2==0){
                        if(temp.val%2!=1||temp.val-prev<1)return false;
                    }
                    else{
                         if(temp.val%2!=0||temp.val-prev>=0)return false;
                    }
            }
            else{
                if(idx%2==0&&temp.val%2!=1||idx%2==1&&temp.val%2!=0)return false;
            }
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
            prev=temp.val;
            }
            idx++;
      }  
      return true; 
   }  
}