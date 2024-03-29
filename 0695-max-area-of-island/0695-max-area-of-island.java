class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length,m=grid[0].length,max=0;
        for(int i=0;i<n;i++){  //traversing each valid island piece
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
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0)return 0; //out of bounds or visted cells conditions
        grid[i][j]=0;//setting visted cell to 0 to escape from infinte loop!
        int area=1;
        //four recursive call for up left right down neighbours
        area+=count_area(grid,i+1,j);
        area+=count_area(grid,i,j+1);
        area+=count_area(grid,i,j-1);
        area+=count_area(grid,i-1,j);
        return area;
    }
}