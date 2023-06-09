class Solution {
    public boolean canJump(int[] nums) {
        int maxDis=0;
        for(int i=0;i<nums.length;i++){
            if(maxDis<i)return false;
            if(nums[i]+i>maxDis){
                maxDis=nums[i]+i;
            }
        }
        return true;
    }
}