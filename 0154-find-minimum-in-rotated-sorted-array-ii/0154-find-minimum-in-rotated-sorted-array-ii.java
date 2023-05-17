class Solution {
    public int findMin(int[] nums) {
      int pvt=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
               pvt=i;
                break;
            }
        }
       return pvt==-1?nums[0]:Math.min(nums[0],nums[pvt]);
    }
}