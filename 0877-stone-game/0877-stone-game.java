class Solution {
    public boolean stoneGame(int[] piles) {
        int[][] dp = new int[piles.length][piles.length];
        for(int i=0;i<piles.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return Stones(dp,piles,0,piles.length-1)>0;
    }
    public int Stones(int[][]dp,int[]piles,int s,int l){
        if(dp[s][l]!=-1)return dp[s][l];
        if(s==l)return piles[s];
        int aScore = piles[s]-Stones(dp,piles,s+1,l);
        int bScore = piles[l]-Stones(dp,piles,s,l-1);
        dp[s][l] = Math.max(aScore,bScore);
        return dp[s][l];
    }
}