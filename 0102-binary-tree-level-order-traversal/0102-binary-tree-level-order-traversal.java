class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> sol = new ArrayList<>();
        if (root == null) {
            return sol;
        }
        
        Queue<TreeNode> orderQ = new ArrayDeque<>();
        orderQ.add(root);
        
        while (!orderQ.isEmpty()) {
            int size = orderQ.size();
            List<Integer> temp = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = orderQ.poll();
                temp.add(node.val);
                
                if (node.left != null) {
                    orderQ.add(node.left);
                }
                if (node.right != null) {
                    orderQ.add(node.right);
                }
            }
            
            sol.add(temp);
        }
        
        return sol;
    }
}
