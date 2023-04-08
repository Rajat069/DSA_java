class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int f=0;
        long sol=0,cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(i-f+1==k){
                if(hm.size()==k){
                    sol=Math.max(sol,cursum);
                }
                cursum-=nums[f];
                hm.put(nums[f],hm.get(nums[f])-1);
                if(hm.get(nums[f])==0)hm.remove(nums[f]);
                f++;
            }
        }
        return sol;
    }
}