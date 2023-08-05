
/* Definition for a binary tree node.
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
    public List<TreeNode> generateTrees(int n) {
        helper(n,new ArrayList<Integer>(),1);
        return sol;
    }
    List<TreeNode> sol = new ArrayList<>();
    HashSet<Integer>hs = new HashSet<>();
    HashSet<String>SerializedSet = new HashSet<>();
    private void helper(int num,ArrayList<Integer>temp,int idx){
        if(idx>num){
           TreeNode tempbst =  CreateBST(new ArrayList<Integer>(temp));
           StringBuilder sb= new StringBuilder();
           String sr = serialize(tempbst,sb);
           if(!SerializedSet.contains(sr)){
               sol.add(tempbst);
               SerializedSet.add(sr);
           }
           return; 
        }
        for(int i=1;i<=num;i++){
            if(!hs.contains(i)){
             temp.add(i);
             hs.add(i);   
             helper(num,temp,idx+1);
             hs.remove(temp.get(temp.size()-1));
             temp.remove(temp.size()-1);   
            }
        }
    }
    public String serialize(TreeNode root,StringBuilder sb) {
        preOrder(root,sb);
        return sb.toString().trim();
    }
    private void preOrder(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("null ");
            return;
        }
        sb.append(root.val+" ");
        preOrder(root.left,sb);
        preOrder(root.right,sb);
    }
    private TreeNode CreateBST(ArrayList<Integer>ar){
       TreeNode root = null;
       for(int i:ar){
           root=bstHelper(root,i);
       }
       return root; 
    }
    private TreeNode bstHelper(TreeNode root,int i){
        if(root==null)return new TreeNode(i);
        if(i>root.val){
            root.right=bstHelper(root.right,i);
        }
        else root.left=bstHelper(root.left,i);
        return root;
    }
}