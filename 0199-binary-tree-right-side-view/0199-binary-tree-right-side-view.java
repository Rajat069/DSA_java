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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> sol = new ArrayList<Integer>();
        return levelorder(root,sol);
    }
    public List<Integer> levelorder(TreeNode root,List<Integer>ar){
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root==null)return ar;
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int prev=0;
            for(int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                prev=temp.val;
                if(temp.left!=null)queue.add(temp.left);
                if(temp.right!=null)queue.add(temp.right);
            }
            ar.add(prev);
        }
        return ar;
    }
}