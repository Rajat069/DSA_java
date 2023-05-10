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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgLv = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);
        while(!queue.isEmpty()){
            double avg =0;
            int size=queue.size(),q=0;
            while(q<size){
                TreeNode temp = queue.poll();
                avg+=temp.val;
                if(temp.right!=null)queue.add(temp.right);
                if(temp.left!=null)queue.add(temp.left);
                q++;
            }
            avgLv.add(avg/size);
        }
        return avgLv;
    }
}