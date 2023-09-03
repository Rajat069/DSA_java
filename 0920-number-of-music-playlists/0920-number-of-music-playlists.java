class Solution {
    int goal,n,k;
    int mod=1000000007;
    long[][]dp;
    public int numMusicPlaylists(int n, int goal, int k) {
         dp=new long[101][101];
         for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1); 
         }
         this.goal=goal;
         this.k=k;
         this.n=n;
         return (int)helper(0,0);
    }
    private long helper(int count,int unq){
        if(count==goal){
            if(unq==n){
                return dp[count][unq]=1;
            }
            return 0;
        }
        if(dp[count][unq]!=-1)return dp[count][unq];
        long res=0;
        if(unq<n)res+=(n-unq)*helper(count+1,unq+1); //choosing unq songs
        
        if(unq>k)res+=(unq-k)*helper(count+1,unq); //choosing old songs
        
        return dp[count][unq]=res%mod;
    }
    
}