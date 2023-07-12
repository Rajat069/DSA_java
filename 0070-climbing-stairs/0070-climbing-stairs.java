class Solution {
    public int climbStairs(int n) {
        return helper(n,new int[n+1]);
    }
    public int helper(int n,int[]dp){
        if(n<0){
            return 0;
        }
        else if(n==0)return 1;
        if(dp[n]!=0)return dp[n];
        int p1 = helper(n-1,dp);
        int p2 = helper(n-2,dp);
        int psum = p1+p2;
        dp[n]=psum;
        return psum;
    }
}