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
    public int deepestLeavesSum(TreeNode root) {
        return sum(root);
    }
    public int sum(TreeNode root){
        if(root==null)return 0;
        Queue<TreeNode> que = new ArrayDeque();
        que.add(root);
        int cursum=0;
        while(!que.isEmpty()){
            int size=que.size(),s=0;
            cursum=0;
            while(s<size){
                TreeNode temp=que.poll();
                if(temp.left!=null)que.add(temp.left);
                if(temp.right!=null)que.add(temp.right);
                s++;
                cursum+=temp.val;
            }
        }
        return cursum;
    }
}