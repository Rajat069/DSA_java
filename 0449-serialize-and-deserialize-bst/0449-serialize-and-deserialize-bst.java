/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        preOrder(root);
        return sb.toString().substring(0,sb.length()-1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return helper(new ArrayDeque<String>(Arrays.asList(data.split(","))));
    }
    private TreeNode helper(Deque<String>data){
        String elem = data.poll();
        if(elem.equals("N")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(elem));
        root.left=helper(data);
        root.right=helper(data);
        return root;
    }
    private StringBuilder sb= new StringBuilder();
    private void preOrder(TreeNode root){
        if(root==null){
            sb.append("N,");
            return;
        }
        sb.append(root.val+",");
        preOrder(root.left);
        preOrder(root.right);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;