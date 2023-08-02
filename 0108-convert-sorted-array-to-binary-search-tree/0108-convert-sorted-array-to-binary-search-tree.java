class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Call the helper function to construct a balanced BST using the sorted array.
        // The initial range for the array is from index 0 to nums.length-1.
        return helper(nums, 0, nums.length - 1);
    }
    
    public TreeNode helper(int[] nums, int low, int high) {
        // Base case: If the low index is greater than the high index, the range is invalid.
        if (low > high) {
            return null;
        }
        
        // Calculate the middle index of the current range.
        int mid = low + (high - low) / 2;
        
        // Create a new TreeNode with the value at the middle index of the nums array.
        TreeNode node = new TreeNode(nums[mid]);
        
        // Recursively construct the left and right subtrees using the left and right halves
        // of the current range in the nums array, respectively.
        node.left = helper(nums, low, mid - 1);
        node.right = helper(nums, mid + 1, high);
        
        // Return the newly constructed TreeNode.
        return node;
    }
}
