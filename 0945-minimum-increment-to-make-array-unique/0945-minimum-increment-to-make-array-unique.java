class Solution {
    public int minIncrementForUnique(int[] nums) {
      int sol=0;
      Arrays.sort(nums); 
      for(int i=1;i<nums.length;i++){
          if(nums[i]<=nums[i-1]){
              sol+=nums[i-1]-nums[i]+1;
              nums[i]+=nums[i-1]-nums[i]+1;
          }
       }
        return sol;
    }
}