class Solution {
    public int change(int amount, int[] coins) {
        int[]dp = new int[amount+1];
        dp[0]=1; // there is one combination to make 0 amount
        for(int i=0;i<coins.length;i++){ //picking coins one by one
            for(int j=coins[i];j<dp.length;j++){ // looping over each amount 0 to amount
            // if amount is greator then coin the only we check as amount needs to be bigger to allow coins to combine themselves to formulate it now we add the ways by adding ways to make amount of amount-coin eg. 7 - 5 we will be adding ways for 2 to it. 
                    dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}