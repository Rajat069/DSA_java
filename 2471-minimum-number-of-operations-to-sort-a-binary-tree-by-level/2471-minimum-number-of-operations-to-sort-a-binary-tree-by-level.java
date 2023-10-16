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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode>queue = new ArrayDeque<>();
        int sol=0;
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer>ar=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                if(temp.left!=null){
                   queue.offer(temp.left);
                   ar.add(temp.left.val); 
                 }
                if(temp.right!=null){
                   queue.offer(temp.right);
                   ar.add(temp.right.val);
                }   
            }
            sol+=minSwapsToSort(ar);
        }
        return sol;
    }
    public static int minSwapsToSort(List<Integer> arr) {
        List<Integer> sortedArray = new ArrayList<>(arr);
        Collections.sort(sortedArray);
        Map<Integer, Integer> valueToIndexMap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            valueToIndexMap.put(arr.get(i), i);
        }
        boolean[] visited = new boolean[arr.size()];
        int swaps = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (visited[i] || arr.get(i).equals(sortedArray.get(i))) {
                continue;
            }
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = valueToIndexMap.get(sortedArray.get(j));
                cycleSize++;
            }
            if (cycleSize > 0) {
                swaps += (cycleSize - 1);
            }
        }
        return swaps;
    }
}