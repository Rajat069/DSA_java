class Solution {
    private int count = 0;  // Global count to keep track of good nodes
    
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;  // Base case: empty tree has 0 good nodes
        
        // Start traversal with the root node and its value as the maximum value
        helper(root, root.val);
        
        return count;  // Return the total count of good nodes
    }
    
    private void helper(TreeNode root, int max) {
        if (root == null) {
            return;  // Base case: reached a null node, exit the current recursion
        }
        
        if (root.val >= max) {
            count++;  // Increment count if the current node is a good node
            max = Math.max(max, root.val);  // Update max with the current node's value
        }
        
        // Recursively process the left and right subtrees, passing the updated max value
        if (root.left != null) {
            helper(root.left, max);
        }
        if (root.right != null) {
            helper(root.right, max);
        }
    }
}
