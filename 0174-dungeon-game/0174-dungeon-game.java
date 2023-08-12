class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        return TopDown(dungeon,0,0,new int[dungeon.length][dungeon[0].length]);
    }
    private int TopDown(int[][]dungeon,int i,int j,int dp[][]){
        if(i>=dungeon.length||j>=dungeon[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        if(i==dungeon.length-1&&j==dungeon[0].length-1){
            return Math.max(1,1-dungeon[i][j]);
        }
        int bot = TopDown(dungeon,i+1,j,dp);
        int rig = TopDown(dungeon,i,j+1,dp);
        dp[i][j] = Math.max(1,Math.min(bot,rig)-dungeon[i][j]);
        return dp[i][j];
    }
}