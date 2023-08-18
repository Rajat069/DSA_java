class Solution {
    public void gameOfLife(int[][] board) {
        int cr=0,cc=0;
        int[][]state1=new int[board.length][board[0].length];
        int[][]dir ={{1,0},{0,1},{-1,0},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
        for(int row[]:board){
            cc=0;
            for(int c:row){
                int alive=0;
                for(int d[]:dir){
                    int nr=d[0]+cr;
                    int nc=d[1]+cc;
                    if(nr>=0&&nr<board.length&&nc>=0&&nc<board[0].length){
                        if(board[nr][nc]==1)alive++;
                    }
                }
                if(c==1&&alive==2||c==1&&alive==3){
                    state1[cr][cc]=1;
                }
                else if(c==0&&alive==3){
                    state1[cr][cc]=1;
                }
              cc++;  
            }
            cr++;
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]=state1[i][j];
            }
        }
    }
}