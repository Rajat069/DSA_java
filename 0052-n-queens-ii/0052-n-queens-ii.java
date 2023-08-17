class Solution {
    int count=0;
    public int totalNQueens(int n) {
        if(n==1)return 1;
        else if(n<=3)return 0;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            board[i]=".".repeat(n).toCharArray();
        }
        helper(n,board,0);
        return count;
    }
    private void helper(int col,char[][]board,int row){
        if(row==col){
            count++;
            return;
        }
        for(int i=0;i<col;i++){
            if(isSafe(row,i,board)){
                board[row][i]='Q';
                helper(col,board,row+1);
                board[row][i]='.';   
            }
        }
    }
    private boolean isSafe(int row,int col,char[][]board){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j]=='Q') return false; 
        }
        
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]=='Q') return false;
        }
        return true;
    }
}