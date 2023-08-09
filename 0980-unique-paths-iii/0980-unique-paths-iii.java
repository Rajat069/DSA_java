class Solution {
    public int uniquePathsIII(int[][] grid) {
        int s1=0,s2=0,ecell=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    s1=i;
                    s2=j;
                }
                else if(grid[i][j]==0)ecell++;
            }
        }
        return pathHelper(grid,s1,s2,ecell);
    }
    public int pathHelper(int[][]grid,int i,int j,int ecell){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==-1){
            return 0;
        }
        if(grid[i][j]==2){
            return ecell==-1?1:0;
        }
        int val=grid[i][j];
        grid[i][j]=-1;
        ecell--;
        int ucall = pathHelper(grid,i-1,j,ecell);
        int dcall = pathHelper(grid,i+1,j,ecell);
        int lcall = pathHelper(grid,i,j-1,ecell);
        int rcall = pathHelper(grid,i,j+1,ecell);
        grid[i][j]=val;
        ecell++;
        return ucall+dcall+lcall+rcall;
    }
}