class Solution {
    public int fib(int n) {
        if(n<=1)return n;
        int[]ar = new int[n+1];
        return helper(n,ar);
    }
    private int helper(int n,int[]dp){
        if(n<=1)return n;
        if(dp[n]>0)return dp[n];
        return dp[n]=fib(n-1)+fib(n-2);
    }
}