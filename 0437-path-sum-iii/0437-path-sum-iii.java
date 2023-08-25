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
    // Essential comment: Method to find paths with the target sum in the binary tree
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        // Note: Using helper function to recursively calculate paths with the target sum
        return helper(root, 0, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    // Essential comment: Helper method to recursively calculate paths with target sum
    private int helper(TreeNode root, long cur, long tar) {
        if (root == null) return 0;
        cur += root.val;
        int count = 0;
        if (cur == tar) {
            count++;
        }
        // Recursive calls for left and right subtrees
        return count + helper(root.left, cur, tar) + helper(root.right, cur, tar);
    }
    // Note: The algorithm uses a recursive DFS (Depth-First Search) approach to calculate paths with a specific target sum in a binary tree.
    // It recursively explores both left and right subtrees, keeping track of the current sum.
    // The main function adds up the counts from the current node and its subtrees to find the total paths.
    // Time Complexity: O(N^2) in the worst case (N = number of nodes) due to overlapping subproblems.
    // Space Complexity: O(H) where H is the height of the tree, for the recursive call stack.
}
