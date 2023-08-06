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
    List<List<Integer>> sol = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null)return sol;
        ArrayList<Integer>t=new ArrayList<>();
        t.add(root.val);
        TravelHelper(root,targetSum,root.val,t);
        return sol;
    }
    private void TravelHelper(TreeNode root,int tar,int cur,ArrayList<Integer>temp){
        if(root==null){
            return;
        }
        if(isLeaf(root)&&tar==cur){
            sol.add(new ArrayList<>(temp));
            return;
        }
        if(root.left!=null){
           temp.add(root.left.val); 
           TravelHelper(root.left,tar,cur+root.left.val,temp);
           temp.remove(temp.size()-1);
        }
        if(root.right!=null){
            temp.add(root.right.val); 
            TravelHelper(root.right,tar,cur+root.right.val,temp); 
            temp.remove(temp.size()-1);
        }
    }
    private boolean isLeaf(TreeNode leaf){
        return leaf.left==null&&leaf.right==null;
    }
    
}