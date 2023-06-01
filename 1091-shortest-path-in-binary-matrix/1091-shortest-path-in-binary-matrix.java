class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
          int row = grid.length-1,col=grid[0].length-1;
          if(grid[0][0]==1||grid[row][col]==1)return -1;
          Queue<int[]>queue = new LinkedList<>();
          int[][] dir = new int[][]{{1,0},{0,1},{1,1},{-1,1},{1,-1},{0,-1},{-1,0},{-1,-1}};
          queue.add(new int[]{0,0,1});
          while(!queue.isEmpty()){
                int[]ar=queue.poll(); 
                int r=ar[0],c=ar[1];
                if(r==row&&c==col)return ar[2];
                for(int[]temp:dir){
                int nextr=r+temp[0],nextc=c+temp[1];  
            if(nextr>=0&&nextr<=row&&nextc>=0&&nextc<=col&&grid[nextr][nextc]==0){
                     queue.offer(new int[]{nextr,nextc,ar[2]+1});
                     grid[nextr][nextc]=1;
                 }   
              }
          }
         return -1;
    }
}