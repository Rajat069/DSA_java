class Solution {
    public int findMin(int[] nums) {
         int i=1;
         for(;i<nums.length;i++){
             if(nums[i]<nums[i-1])return nums[i];
         }
        return nums[0];
    }
}