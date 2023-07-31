class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> sol = new  ArrayList<>();
        for(int i=0;i<nums.length;i++){
           if(i>0&&nums[i]==nums[i-1])continue;
            for(int j=i+1;j<nums.length;j++){
               if(j>i+1&&nums[j]==nums[j-1])continue;
                 for(int q=j+1;q<nums.length;q++){
                   if(q>j+1&&nums[q]==nums[q-1])continue;
                    for(int t=q+1;t<nums.length;t++){
                        if(t>q+1&&nums[t]==nums[t-1])continue;
                        long sum = nums[i]+nums[j];
                        sum+=nums[q]+nums[t];
                        if(sum==target){
                            List<Integer> ar = new ArrayList<>();
                            ar.add(nums[i]);
                            ar.add(nums[j]);
                            ar.add(nums[q]);
                            ar.add(nums[t]);
                            sol.add(ar);
                        }
                    } 
                 }
            }
            
        }
        return sol;
    }
}