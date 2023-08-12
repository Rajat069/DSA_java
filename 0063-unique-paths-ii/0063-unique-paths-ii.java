class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<dp[0].length;i++){
            if(obstacleGrid[0][i]==1){
                break;
            }
            else dp[0][i]=1;
        }
        for(int i=0;i<dp.length;i++){ //for one row and collumn we break if any rock is found
            if(obstacleGrid[i][0]==1){
                break;
            }
            else dp[i][0]=1;
        }
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
                    if(obstacleGrid[i][j]!=1){
                        dp[i][j]=(obstacleGrid[i-1][j]==1?0:dp[i-1][j])+(obstacleGrid[i][j-1]==1?0:dp[i][j-1]);
                    }
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}