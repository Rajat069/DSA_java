class Solution {
    public int coinChange(int[] coins, int amount) {
        int[]dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int minC=helper(coins,amount,dp);
        return minC==Integer.MAX_VALUE?-1:minC;
    }
    private int helper(int[]coins,int amt,int dp[]){
        if(amt==0){
            return 0;
        }
        int noC=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(amt-coins[i]>=0){
                int sub=0;
                if(dp[amt-coins[i]]!=-1){
                    sub=dp[amt-coins[i]];
                }
                else sub = helper(coins,amt-coins[i],dp);
                if(sub!=Integer.MAX_VALUE&&sub+1<noC){
                    noC=sub+1;
                }
            }
        }
        return dp[amt]=noC;
    }
}