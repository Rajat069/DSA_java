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
    public int widthOfBinaryTree(TreeNode root) {
        ArrayDeque<Pair<TreeNode,Integer>>queue= new ArrayDeque<>();
        queue.offer(new Pair<>(root,0));
        int maxW=-1;
        while(!queue.isEmpty()){
             int size=queue.size();
             maxW=Math.max(maxW,(queue.getLast().getValue()-queue.getFirst().getValue())+1);
             for(int i=0;i<size;i++){
                 Pair<TreeNode,Integer>pair = queue.poll();
                 TreeNode temp = pair.getKey();
                 int idx=pair.getValue();
                 if(temp.left!=null){
                    queue.offer(new Pair<>(temp.left,idx*2));  
                 }
                 if(temp.right!=null){
                    queue.offer(new Pair<>(temp.right,idx*2+1));  
                 }
             }
        }
        return maxW;
    }
}