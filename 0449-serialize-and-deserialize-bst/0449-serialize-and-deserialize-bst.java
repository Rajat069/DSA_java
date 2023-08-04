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
    StringBuilder sb = new StringBuilder();
    public String serialize(TreeNode root) {
        if(root==null)return "";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node==null){
                sb.append("N ");
                continue;
            }
            sb.append(node.val+" ");
            queue.add(node.left);
            queue.add(node.right);
        }
        return sb.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")return null;
        String[] splitData = data.split(" ");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode parent = new TreeNode(Integer.parseInt(splitData[0]));
        queue.add(parent);
        for(int i=1;i<splitData.length;i++){
            TreeNode node = queue.poll();
            if(!splitData[i].equals("N")){
                TreeNode left = new TreeNode(Integer.parseInt(splitData[i]));
                node.left=left;
                queue.add(left);
            }
            if(!splitData[++i].equals("N")){
                TreeNode right = new TreeNode(Integer.parseInt(splitData[i]));
                node.right=right;
                queue.add(right);
            }
        }
        return parent;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;