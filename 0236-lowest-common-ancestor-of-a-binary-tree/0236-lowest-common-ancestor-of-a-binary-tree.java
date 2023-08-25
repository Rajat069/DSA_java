class Solution {
    /**
     * Finds the lowest common ancestor of two nodes in a binary tree.
     *
     * @param root The root node of the binary tree.
     * @param p One of the nodes whose ancestor needs to be found.
     * @param q The other node whose ancestor needs to be found.
     * @return The lowest common ancestor node of nodes p and q.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if the root is null, return null (no ancestor).
        if (root == null) {
            return null;
        }
        
        // If the root is either p or q, it is the common ancestor.
        if (root == p || root == q) {
            return root;
        }
        
        // Recursively search for p and q in the left and right subtrees.
        TreeNode leftSearch = lowestCommonAncestor(root.left, p, q);
        TreeNode rightSearch = lowestCommonAncestor(root.right, p, q);
        
        // If both leftSearch and rightSearch are not null, it means p and q
        // are found in different subtrees, so the current root is the LCA.
        if (leftSearch != null && rightSearch != null) {
            return root;
        }
        
        // If either leftSearch or rightSearch is not null, return it.
        // If both are null, return null.
        return (leftSearch != null) ? leftSearch : rightSearch;
    }
}
