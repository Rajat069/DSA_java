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
        if(root==null)return "";
        Queue<TreeNode> queue = new LinkedList<>(); //using ll lets us use null into our BFS
        StringBuilder encoded = new StringBuilder();
        queue.add(root);
        while(!queue.isEmpty()){
                TreeNode temp = queue.poll();
                if(temp==null){
                    encoded.append("N,");
                    continue; // if null skip rest
                }
                encoded.append(temp.val+",");
                queue.add(temp.left); //null will be added to queue if it is null
                queue.add(temp.right);
        }
        return encoded.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")return null;
        String[] nodes = data.split(","); // "," as a delimitter
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root=new TreeNode(Integer.valueOf(nodes[0])); 
        queue.add(root);
        for(int i=1;i<nodes.length;i++){ //checking all strings Node,left,right,Node....... 
                TreeNode pNode = queue.poll();
                if(!nodes[i].equals("N")){  
                    TreeNode left = new TreeNode(Integer.valueOf(nodes[i]));
                    pNode.left = left;
                    queue.add(left);
                }
                if(!nodes[++i].equals("N")){
                    TreeNode right = new TreeNode(Integer.valueOf(nodes[i]));
                    pNode.right = right;
                    queue.add(right);
                }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));