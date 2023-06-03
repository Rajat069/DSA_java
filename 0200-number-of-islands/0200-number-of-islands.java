class Solution {
    public int numIslands(char[][] grid) {
        int no=0,n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){ //each visit will set a valid island to '0'
                    visit(grid,i,j);
                    no++;  //counting each visit
                }
            }
        }
        return no;
    }
     public void visit(char[][]grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0')return; //out of bounds or visted cells conditions
        grid[i][j]='0';//setting visted cell to 0 to escape from infinte loop!
        //four recursive call for up left right down neighbours
        visit(grid,i+1,j);
        visit(grid,i,j+1);
        visit(grid,i,j-1);
        visit(grid,i-1,j);
        return;
    }
}