class Solution {
    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        if (root == null) return 0;
        inorder(root);
        return count;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        Pair<Integer, Integer> pair = calculateSum(root, new Pair<>(0, 0));
        int sum = pair.getKey();
        int numNodes = pair.getValue();
        if (numNodes != 0 && sum / numNodes == root.val) {
            count++;
        }
        inorder(root.right);
    }
    private Pair<Integer, Integer> calculateSum(TreeNode root, Pair<Integer, Integer> sumPair) {
        if (root == null) {
            return sumPair;
        }
        Pair<Integer, Integer> leftSumPair = calculateSum(root.left, sumPair);
        Pair<Integer, Integer> updatedSumPair = new Pair<>(
            leftSumPair.getKey() + root.val,
            leftSumPair.getValue() + 1
        );
        return calculateSum(root.right, updatedSumPair);
    }
}
