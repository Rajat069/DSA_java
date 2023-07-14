class Solution {
    public int islandPerimeter(int[][] grid) {
        int per=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)per+=NeighbourIslands(grid,i,j);
            }
        }
        return per;
    }
    public int NeighbourIslands(int[][]grid,int i,int j){
        int nc=0;
        if(i-1>=0&&i-1<grid.length){
            if(grid[i-1][j]==1)nc++;
        }
         if(i+1>=0&&i+1<grid.length){
            if(grid[i+1][j]==1)nc++;
        }
         if(j-1>=0&&j-1<grid[0].length){
            if(grid[i][j-1]==1)nc++;
        }
         if(j+1>=0&&j+1<grid[0].length){
            if(grid[i][j+1]==1)nc++;
        }
        return 4-nc;
    }
}