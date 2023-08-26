class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][]dp = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0){
                    dp[i][j]=matrix[i][j];
                }
                else{
                     if(j==0){
                         dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j+1])+matrix[i][j];
                     }
                     else if(j==matrix[0].length-1){
                         dp[i][j]=Math.min(dp[i-1][j-1],dp[i-1][j])+matrix[i][j];
                     }
                     else{
                         dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i-1][j+1]))+matrix[i][j];
                     }
                }
            }
        }
        int sol=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            sol=Math.min(dp[matrix.length-1][i],sol);
        }
        return sol;
    }
}