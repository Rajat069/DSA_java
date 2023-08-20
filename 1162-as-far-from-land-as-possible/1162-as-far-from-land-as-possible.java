class Solution {
    public class Node{
        int x;
        int y;
        int val;
        Node(int x,int y,int val){
            this.x=x;
            this.y=y;
            this.val=val;
        }
    }
    public int maxDistance(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][]minDis = new int[grid.length][grid[0].length];
        Queue<Node>queue = new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    queue.add(new Node(i,j,0));
                }
            }
        }
        int[][]dir = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            int x=temp.x;
            int y=temp.y;
            int val=temp.val;
            minDis[x][y]=val;
            for(int d[]:dir){
                int nr = x+d[0];
                int nc = y+d[1];
                if(nr>=0&&nr<grid.length&&nc>=0&&nc<grid[0].length&&grid[nr][nc]==0&&!visited[nr][nc]){
                       visited[nr][nc]=true;
                       queue.offer(new Node(nr,nc,val+1));   
                   }
                }
          }
         int maxD=Integer.MIN_VALUE;
         for(int rows[]:minDis){
             for(int c:rows){
                 maxD=Math.max(maxD,c);
             }
         }
        return maxD==0?-1:maxD;
    }
}
