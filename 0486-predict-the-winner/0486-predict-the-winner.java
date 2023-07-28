class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int[][]dp = new int[nums.length][nums.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return PWinner(nums,dp,0,nums.length-1)>=0; 
    }
    public int PWinner(int[]nums,int[][]dp,int l,int r){
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        if(l==r)return nums[l];
        int lscore = nums[l]-PWinner(nums,dp,l+1,r);
        int rscore = nums[r]-PWinner(nums,dp,l,r-1);
        int maxS=Math.max(lscore,rscore);
        dp[l][r]=maxS;
        return dp[l][r];
    }
}