class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length,m=grid[0].length,max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int count=count_area(grid,i,j);   
                    max=Math.max(count,max);
                }
            }
        }
        return max;
    }
    public int count_area(int[][]grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length)return 0;
        if(grid[i][j]==0)return 0;
        grid[i][j]=0;
        int area=1;
        area+=count_area(grid,i+1,j);
        area+=count_area(grid,i,j+1);
        area+=count_area(grid,i,j-1);
        area+=count_area(grid,i-1,j);
        return area;
    }
}