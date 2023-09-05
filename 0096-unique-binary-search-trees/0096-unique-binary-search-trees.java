class Solution {
    public int numTrees(int n) {
        return helper(n,new int[n+1]);
    }
    private int helper(int nodes,int[]dp){
        if(nodes<=1)return 1;
        if(dp[nodes]!=0)return dp[nodes];
        int unqBST=0;
        for(int node=1;node<=nodes;node++){
            unqBST+=helper(node-1,dp)*helper(nodes-node,dp);
        }
        return dp[nodes]=unqBST;
    }
}