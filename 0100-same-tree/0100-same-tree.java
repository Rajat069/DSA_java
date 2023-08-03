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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String TreeSerial1  = Serialize(p);
        String TreeSerial2  = Serialize(q);
        return TreeSerial1.equals(TreeSerial2);
    }
    private String Serialize(TreeNode root){
        if(root==null)return "";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp==null){
                sb.append("N");
                continue;
            }
            sb.append(temp.val);
            queue.add(temp.left);
            queue.add(temp.right);
        }
        return sb.toString();
    }
}