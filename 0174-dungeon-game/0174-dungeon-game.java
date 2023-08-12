class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
         int[][]dp = new int[dungeon.length][dungeon[0].length];
         int r=dungeon.length-1,c=dungeon[0].length-1;
         dp[r][c]=dungeon[r][c]>0?1:Math.abs(dungeon[r][c])+1;
         for(int i=r-1;i>=0;i--){
               dp[i][c]=Math.max((dp[i+1][c]-dungeon[i][c]),1);
         }
         for(int i=c-1;i>=0;i--){
               dp[r][i]=Math.max((dp[r][i+1]-dungeon[r][i]),1);
         }
         for(int i=r-1;i>=0;i--){
             for(int j=c-1;j>=0;j--){
               dp[i][j]=Math.max((Math.min(dp[i+1][j],dp[i][j+1])-dungeon[i][j]),1);
             }
         }
        return dp[0][0];
    }
}