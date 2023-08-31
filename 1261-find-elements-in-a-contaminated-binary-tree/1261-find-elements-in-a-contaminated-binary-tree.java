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
class FindElements {

    public FindElements(TreeNode root) {
        root.val=0;
        hs.add(0);
        helper(root,0);
    }
    HashSet<Integer>hs = new HashSet<>();
    private void helper(TreeNode root,int cur){
        if(root==null)return;
        if(root.left!=null){
            root.left.val=cur*2+1;
            hs.add(root.left.val);
            helper(root.left,root.left.val);
        }
        if(root.right!=null){
            root.right.val=cur*2+2;
            hs.add(root.right.val);
            helper(root.right,root.right.val);
        }
    }
    
    public boolean find(int target) {
        return hs.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */