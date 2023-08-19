class Solution {
    HashSet<Pair<Integer,Integer>> hs = new HashSet<>();
    public void solve(char[][] board) {
        char[][]boardSol = new char[board.length][board[0].length];
        markBorderCells(board);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&&i!=0&&i!=board.length-1&&j!=0&&j!=board[0].length&&!hs.contains(new Pair<>(i,j))){
                boolean r=false,l=false,u=false,d=false;
                for(int q=j;q<board[0].length;q++){
                     if(board[i][q]=='X'&&!hs.contains(new Pair<>(i,j))){
                         r=true;
                         break;
                     }
                }
                for(int q=j;q>=0;q--){
                      if(board[i][q]=='X'&&!hs.contains(new Pair<>(i,j))){
                         l=true;
                         break;
                     }
                }
                for(int q=i;q<board.length;q++){
                       if(board[q][j]=='X'&&!hs.contains(new Pair<>(i,j))){
                          d=true;
                          break; 
                       }
                }
                for(int q=i;q>=0;q--){
                        if(board[q][j]=='X'&&!hs.contains(new Pair<>(i,j))){
                          u=true;
                          break; 
                       }
                }
                 if(r&&l&&u&&d){
                    boardSol[i][j]='X';
                 }   
               }
               if(boardSol[i][j]=='\u0000'){
                   boardSol[i][j]=board[i][j];
               } 
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]=boardSol[i][j];
            }
        }
    }
    private void markBorderCells(char[][]board){
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]=='O'){
                boolean[][]vis = new boolean[board.length][board[0].length];
                markhelper(board,0,i,vis);
            }
        }
        for(int i=0;i<board[0].length;i++){
            if(board[board.length-1][i]=='O'){
                boolean[][]vis = new boolean[board.length][board[0].length];
                markhelper(board,board.length-1,i,vis);
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O'){
                boolean[][]vis = new boolean[board.length][board[0].length];
                markhelper(board,i,0,vis);
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][board[0].length-1]=='O'){
                boolean[][]vis = new boolean[board.length][board[0].length];
                markhelper(board,i,board[0].length-1,vis);
            }
        }
    }
    private int[][]dir= {{1,0},{0,1},{0,-1},{-1,0}};
    private void markhelper(char[][]board,int i,int j,boolean[][]visited){
        if(i<0||i>=board.length||j<0||j>=board[0].length||visited[i][j]||board[i][j]=='X'){
            return;
        }
        hs.add(new Pair<>(i,j));
        visited[i][j]=true;
        for(int d[]:dir){
            int newr = i+d[0];
            int newc = j+d[1];
            markhelper(board,newr,newc,visited);
        }
    }
}