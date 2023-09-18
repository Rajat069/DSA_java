class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]dp= new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,cost.length-1,dp),helper(cost,cost.length-2,dp));
    }
    private int helper(int[]costs,int n,int[]dp){
        if(n<0)return 0;
        if(n==0||n==1){
            return costs[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int cost=costs[n]+Math.min(helper(costs,n-1,dp),helper(costs,n-2,dp));
        return dp[n]=cost;
    }
}