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
    HashMap<Integer,Integer>hm = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,0,inorder.length-1);
    }
    private TreeNode helper(int[]preorder,int[]inorder,int pidx,int ins,int ine){
         if(pidx==preorder.length||ins>ine){ //if pidx have covered all and inorder index is greator then insertion end
                return null;
         }
         int elem=preorder[pidx++];
         TreeNode root= new TreeNode(elem);
         int pos=hm.get(elem);
         root.left=helper(preorder,inorder,pidx,ins,pos-1);
         root.right=helper(preorder,inorder,pidx+pos-ins,pos+1,ine);
         return root;
    }
}