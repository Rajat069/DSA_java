class Solution {
    public int[] runningSum(int[] nums) {
        int temp = nums[0];
        for(int i=0;i<nums.length;i++){
            nums[i]=temp;
            if(i==nums.length-1)break;
            temp+=nums[i+1];
        }
      return nums;
    }
}