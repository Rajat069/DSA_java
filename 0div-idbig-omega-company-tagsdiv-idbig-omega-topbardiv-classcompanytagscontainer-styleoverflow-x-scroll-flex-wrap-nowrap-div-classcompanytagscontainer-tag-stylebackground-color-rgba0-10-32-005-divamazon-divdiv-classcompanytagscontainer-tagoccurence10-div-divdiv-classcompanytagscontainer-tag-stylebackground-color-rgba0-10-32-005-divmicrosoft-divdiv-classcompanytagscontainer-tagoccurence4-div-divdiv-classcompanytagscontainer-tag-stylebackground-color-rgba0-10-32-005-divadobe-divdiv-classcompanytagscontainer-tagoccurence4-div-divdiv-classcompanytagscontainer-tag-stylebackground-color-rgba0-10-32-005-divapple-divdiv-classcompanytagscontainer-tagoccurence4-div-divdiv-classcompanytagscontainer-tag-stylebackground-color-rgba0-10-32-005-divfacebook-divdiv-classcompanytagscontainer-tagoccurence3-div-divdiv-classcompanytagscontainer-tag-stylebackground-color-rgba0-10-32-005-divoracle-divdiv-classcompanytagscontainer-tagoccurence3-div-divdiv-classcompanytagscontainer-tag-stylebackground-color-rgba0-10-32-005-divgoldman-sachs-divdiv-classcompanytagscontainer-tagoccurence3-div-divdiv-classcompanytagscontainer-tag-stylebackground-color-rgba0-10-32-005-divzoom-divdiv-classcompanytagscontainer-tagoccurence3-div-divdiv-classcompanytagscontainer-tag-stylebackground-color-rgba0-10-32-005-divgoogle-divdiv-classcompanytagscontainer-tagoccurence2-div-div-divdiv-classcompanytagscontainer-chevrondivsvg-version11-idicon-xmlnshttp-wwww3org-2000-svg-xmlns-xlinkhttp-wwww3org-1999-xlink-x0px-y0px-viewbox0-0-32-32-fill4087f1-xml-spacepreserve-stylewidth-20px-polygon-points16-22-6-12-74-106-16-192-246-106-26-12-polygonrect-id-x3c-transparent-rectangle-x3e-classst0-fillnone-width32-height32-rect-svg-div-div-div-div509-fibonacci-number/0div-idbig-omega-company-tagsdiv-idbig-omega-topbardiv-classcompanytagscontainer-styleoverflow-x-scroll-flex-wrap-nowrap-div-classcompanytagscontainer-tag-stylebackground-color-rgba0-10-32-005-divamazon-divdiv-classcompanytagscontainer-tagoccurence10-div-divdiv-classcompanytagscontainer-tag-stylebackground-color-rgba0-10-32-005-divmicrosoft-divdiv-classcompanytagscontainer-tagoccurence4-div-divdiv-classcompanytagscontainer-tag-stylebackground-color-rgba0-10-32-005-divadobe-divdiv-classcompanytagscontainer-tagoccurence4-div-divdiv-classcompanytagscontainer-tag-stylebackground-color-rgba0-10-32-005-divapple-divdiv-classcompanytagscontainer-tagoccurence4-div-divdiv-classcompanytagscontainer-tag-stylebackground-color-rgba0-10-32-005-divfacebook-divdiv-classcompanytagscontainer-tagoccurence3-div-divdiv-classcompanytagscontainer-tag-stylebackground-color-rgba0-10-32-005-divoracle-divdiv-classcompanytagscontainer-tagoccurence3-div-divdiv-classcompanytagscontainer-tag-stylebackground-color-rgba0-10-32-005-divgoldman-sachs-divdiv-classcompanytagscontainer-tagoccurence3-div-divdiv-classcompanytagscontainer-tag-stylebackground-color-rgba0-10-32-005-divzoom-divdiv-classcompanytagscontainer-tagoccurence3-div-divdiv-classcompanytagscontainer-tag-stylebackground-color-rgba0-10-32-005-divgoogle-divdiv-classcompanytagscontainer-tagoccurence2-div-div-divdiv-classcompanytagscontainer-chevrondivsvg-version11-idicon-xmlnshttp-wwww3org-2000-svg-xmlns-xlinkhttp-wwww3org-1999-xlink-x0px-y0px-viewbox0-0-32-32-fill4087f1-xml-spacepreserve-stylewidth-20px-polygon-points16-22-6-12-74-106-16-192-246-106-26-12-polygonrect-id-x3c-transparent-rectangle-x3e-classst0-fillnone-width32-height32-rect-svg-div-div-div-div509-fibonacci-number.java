class Solution {
    public int fib(int n) {
        if(n<=1)return n;
        int[]ar = new int[n+1];
        return helper(n,ar);
    }
    private int helper(int n,int[]dp){
        if(n<=1)return n;
        if(dp[n]>0)return dp[n];
        int num1=helper(n-1,dp);
        int num2=helper(n-2,dp);
        int sum=num1+num2;
        return dp[n]=sum;
    }
}