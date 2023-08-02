class Solution {
    public TreeNode balanceBST(TreeNode root) {
        if (root == null) {
            // If the root is null, the tree is already balanced.
            return root;
        }

        // Step 1: Perform an inorder traversal to obtain a sorted array.
        inorder(root);

        // Step 2: Use the sorted array to construct a balanced BST.
        int f = 0; // First index of the sorted array.
        int l = ar.size() - 1; // Last index of the sorted array.
        return helper(f, l);
    }

    private TreeNode helper(int low, int high) {
        // Base case: If low index is greater than high index, the range is invalid.
        if (low > high) {
            return null;
        }

        // Calculate the middle index of the current range.
        int mid = low + (high - low) / 2;

        // Create a new TreeNode with the value at the middle index.
        TreeNode node = new TreeNode(ar.get(mid));

        // Recursively construct left and right subtrees using the left and right halves
        // of the current range, respectively.
        node.left = helper(low, mid - 1);
        node.right = helper(mid + 1, high);

        // Return the newly constructed TreeNode.
        return node;
    }

    // An ArrayList to store elements of the binary tree in sorted order.
    ArrayList<Integer> ar = new ArrayList<>();

    private void inorder(TreeNode root) {
        // Base case: If the current root is null, return.
        if (root == null) {
            return;
        }

        // Inorder traversal: Recursively visit the left subtree, add the current node's value
        // to the ArrayList, and then recursively visit the right subtree.
        inorder(root.left);
        ar.add(root.val);
        inorder(root.right);
    }
}
