class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        DFS(0,target,candidates,new ArrayList<>(),0);
        return sol;
    }
    List<List<Integer>> sol = new ArrayList<>();
    HashSet<String> dupli = new HashSet<>();
    public void DFS(int sum,int tar,int[] candidates,List<Integer> temp,int idx) {
        if (sum == tar) {
            sol.add(new ArrayList<>(temp)); 
            return;
        }
        if (sum > tar || idx == candidates.length) {
            return;
        }
         for(int i=idx;i<candidates.length;i++){
         temp.add(candidates[i]);
         DFS(sum+candidates[i],tar,candidates,temp,i);
         temp.remove(temp.size() - 1);      
         }
    }

}