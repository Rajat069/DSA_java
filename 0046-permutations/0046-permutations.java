class Solution {
    List<List<Integer>> sol = new ArrayList<>();
    HashSet<Integer>hs = new HashSet<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums,new ArrayList<>(),0);
        return sol;
    }
    public void helper(int[]nums,List<Integer>temp,int idx){
        if(idx==nums.length){
            sol.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
            temp.add(nums[i]);
            hs.add(nums[i]);  
            helper(nums,temp,idx+1);
            hs.remove(temp.get(temp.size()-1));
            temp.remove(temp.size()-1);   
            }
        }
    }
}