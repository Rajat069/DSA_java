class Solution {
    public int maxOperations(int[] nums) {
        int c=1,s=nums[0]+nums[1];
        for(int i=2;i<nums.length-1;i+=2){
            if(nums[i]+nums[i+1]==s)c++;
            else break;
        }
        return c;
    }
}