class Solution {
    public int idx = 0;
    public int sol = -1;

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return sol;
    }

    public void helper(TreeNode root, int k) {
        if (root == null) return;

        helper(root.left, k);
        idx++;
        
        if (idx == k) {
            sol = root.val;
            return;
        }

        helper(root.right, k);
    }
}
