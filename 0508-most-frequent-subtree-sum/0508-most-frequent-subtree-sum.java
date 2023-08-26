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
    HashMap<Integer,Integer>hm = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        subtreesum(root);
        PriorityQueue<Pair<Integer,Integer>>pq = new PriorityQueue<>((a,b)->{
            return b.getValue()-a.getValue();
        });
        for(int key:hm.keySet()){
            Pair<Integer,Integer>pair = new Pair<>(key,hm.get(key));
            pq.offer(pair);
        }
        int c=1;
        Pair<Integer,Integer>p = pq.poll();
        ArrayList<Integer>ar= new ArrayList<>();
        while(!pq.isEmpty()&&p.getValue()==pq.peek().getValue()){
            ar.add(pq.poll().getKey());
            c++;
        }
        int[]sol = new int[c];
        sol[0]=p.getKey();
        int idx=0;
        while(idx<ar.size()){
            sol[idx+1]=ar.get(idx++);
        }
        return sol;
    }
    private int subtreesum(TreeNode root){
        if(root==null)return 0;
        int val=root.val+subtreesum(root.left)+subtreesum(root.right);
        hm.put(val,hm.getOrDefault(val,0)+1);
        return val;
    }
}