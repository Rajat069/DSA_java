class Solution {
    //direction is top-to-bottom //meaning of cell is: no of paths till that cell
    public int uniquePaths(int m, int n) {
        int[][]dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];  //except i==0 and j==0 the value in dp[i][j] is the sum of upper and left block of current pos
                }
            }
        }
        return dp[m-1][n-1];
    }
}