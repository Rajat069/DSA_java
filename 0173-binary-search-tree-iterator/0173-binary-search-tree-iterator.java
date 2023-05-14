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
class BSTIterator {
    int cur=-1,small=999999;
    ArrayList<Integer>ar;
    public BSTIterator(TreeNode root) {
         ar=new ArrayList<>();
         inorder(root);
    }
    public void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        ar.add(root.val);
        inorder(root.right);
    }
    public int next() {
        cur++;
        return ar.get(cur);
    }
    
    public boolean hasNext() {
        return cur+1<ar.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */