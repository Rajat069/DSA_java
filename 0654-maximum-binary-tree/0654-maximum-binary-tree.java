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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums);
    }
    private TreeNode helper(int[]ar){
        if(ar.length==0)return null;
        if(ar.length==1){
            return new TreeNode(ar[0]);
        }
        int max=Integer.MIN_VALUE,idx=-1;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
                idx=i;
            }
        }
        TreeNode root=new TreeNode(max);
        root.left=helper(Arrays.copyOfRange(ar,0,idx));
        root.right=helper(Arrays.copyOfRange(ar,idx+1,ar.length));
        return root;
    }
}