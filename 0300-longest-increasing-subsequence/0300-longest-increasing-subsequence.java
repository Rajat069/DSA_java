class Solution {
    public int lengthOfLIS(int[] nums) {
        Integer[][]dp = new Integer[nums.length+1][nums.length+1];
        return helper(nums,0,-1,dp);
    }
    private int helper(int[] nums, int idx, int max,Integer[][] dp) {
    if (idx == nums.length) {
        return 0;
    }
    if(dp[idx][max+1]!=null)return dp[idx][max+1];
    int len=0;
    if(max==-1||nums[idx]>nums[max]){
        len = 1 + helper(nums,idx+1,idx,dp);
    }
    len=Math.max(len,helper(nums,idx+1,max,dp));
    dp[idx][max+1]=len;    
    return len;
   }
}