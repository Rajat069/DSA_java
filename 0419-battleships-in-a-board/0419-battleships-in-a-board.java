class Solution {
    public int countBattleships(char[][] board) {
        int bs=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    deleteShip(board,i,j);
                    bs++;
                }
            }
        }
        return bs;
    }
    public void deleteShip(char[][] board,int i,int j){
       if (i + 1 < board.length && board[i + 1][j] == 'X') {
       for (int q = i + 1; q < board.length && board[q][j] == 'X'; q++) {
             board[q][j] = '.';
           }
       }
       for (int q = j + 1; q < board[0].length && board[i][q] == 'X'; q++) {
             board[i][q] = '.';
           }
       } 
}