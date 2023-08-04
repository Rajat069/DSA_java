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
        if (sum > tar || idx == candidates.length) { //sum > tar early exit!
            return;
        }
         for(int i=idx;i<candidates.length;i++){  //start from idx to avoid adding candidate[i] in other combintaion
         temp.add(candidates[i]); 
         DFS(sum+candidates[i],tar,candidates,temp,i);
         temp.remove(temp.size() - 1); //backtracking removing element      
         }
    }

}
/*
Target: 8

           []
       /   |   \
     [2]  [3]   [5]    (Sum: 0)
     /    /  \    \
   [2,2] [2,3] [2,5]  (Sum: 2)
   /      |
[2,2,2]  [2,3,3]     (Sum: 4)
   |        |
[2,2,2,2]  [2,3,3]   (Sum: 6)
            |
         [2,3,3]      (Sum: 8) -> Added to the result
         /
   [2,3,3,3]           (Sum: 11) -> Exceeds the target (8), backtrack
   /
[2,3,3,3,3]           (Sum: 14) -> Exceeds the target (8), backtrack

[2,3,3,5]             (Sum: 13) -> Exceeds the target (8), backtrack

[2,5,5]               (Sum: 12) -> Exceeds the target (8), backtrack

[3,3,3]               (Sum: 9) -> Exceeds the target (8), backtrack

[3,5]                 (Sum: 8) -> Added to the result

[5,5]                 (Sum: 10) -> Exceeds the target (8), backtrack

*/