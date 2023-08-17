class Solution {
    class Node{
        int row;
        int col;
        int steps;
        Node(int row,int col,int steps){
            this.row=row;
            this.col=col;
            this.steps=steps;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        boolean[][]visited = new boolean[mat.length][mat[0].length];
        Queue<Node>queue = new ArrayDeque<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    queue.offer(new Node(i,j,0));
                    visited[i][j]=true;
                }
            }
        }
        int[][]updM = new int[mat.length][mat[0].length];
        int[][]dir= {{1,0},{0,-1},{-1,0},{0,1}};
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            int x=temp.row;
            int y=temp.col;
            int steps=temp.steps;
            updM[x][y]=steps;
            for(int d[]:dir){
                int nrow = d[0]+x;
                int ncol = d[1]+y;
                if(nrow>=0&&nrow<mat.length&&ncol>=0&&ncol<mat[0].length&&!visited[nrow][ncol]&&mat[nrow][ncol]!=0){
                    queue.add(new Node(nrow,ncol,steps+1));
                    visited[nrow][ncol]=true;
                }
            }
        }
        return updM;
    }
}

/*
the approach of using recursive backtracking with memoization, as shown in code, can take a considerable amount of time, especially for large input matrices


class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] sol = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                boolean[][] visited = new boolean[mat.length][mat[0].length];
                sol[i][j]=mat[i][j]==0?0:helper(mat,i,j,visited);
            }
        }
        return sol;
    }
      private int helper(int[][] mat, int i, int j, boolean[][] visited) {
           if(i >= mat.length || i < 0 || j < 0 || j >= mat[0].length || visited[i][j]) {
                return 2;
           }
           if(mat[i][j] == 0) {
              return 0;
           }
           visited[i][j] = true;
           int l =helper(mat,i,j+1,visited);
           int r =helper(mat,i,j-1,visited);
           int u =helper(mat,i-1,j,visited);
           int d =helper(mat,i+1,j,visited);
           visited[i][j] = false;
           int min1 = Math.min(l, r);
           int min2 = Math.min(u, d);
           return Math.min(min1, min2)+1;
       }
    }
*/