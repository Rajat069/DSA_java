class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> ispresent = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                String row = "No"+board[i][j]+"rowno:"+i;
                String col = "No"+board[i][j]+"colno:"+j;
                String grid = "No"+board[i][j]+"gridno:"+i/3+" "+j/3;
                if(ispresent.contains(row)||ispresent.contains(col)||ispresent.contains(grid))return false;
                ispresent.add(row);
                ispresent.add(col);
                ispresent.add(grid);   
                }
            }
        }
        return true;
    }
}