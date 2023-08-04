class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helperComb2(candidates,new ArrayList<Integer>(),target,0,0);
        return sol;
    }
    List<List<Integer>> sol = new ArrayList<>();
    public void helperComb2(int[]candidates,ArrayList<Integer>temp,int tar,int cursum,int idx){
        if(cursum==tar){
            sol.add(new ArrayList<>(temp));
            return;
        }
        if(cursum>tar||idx>=candidates.length){
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx&&candidates[i]==candidates[i-1])continue;
            temp.add(candidates[i]);
            helperComb2(candidates,temp,tar,cursum+candidates[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}