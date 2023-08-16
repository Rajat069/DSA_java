class Solution {
    List<List<String>>allValid = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        if(n==1){
            List<String>temp = new ArrayList<>();
            temp.add("Q");
            allValid.add(temp);
            return allValid;
        }
        if(n<=3)return allValid;
        char[][] b= new char[n][n];
        for(int i=0;i<n;i++){
            b[i]=".".repeat(n).toCharArray();
        }
        helper(n,b,0);
        return allValid;
    }
   private void helper(int n, char[][] board, int row) {
    if (row == n) {
        ArrayList<String> temp = convertToArrayList(board);
        allValid.add(temp);
        return;
    }
    for (int i = 0; i < n; i++) {
        if (isSafe(row, i, board)) {
            board[row][i] = 'Q';
            helper(n, board, row + 1);  // Increment 'row' here
            board[row][i] = '.';
        }
    }
}
    public static ArrayList<String> convertToArrayList(char[][] twoDArray) {
        ArrayList<String> ar = new ArrayList<>();
        for (char[] row : twoDArray) {
            StringBuilder sb = new StringBuilder();
            for(char c:row){
                sb.append(c);
            }
            ar.add(sb.toString());
        }
        return ar;
    }
    
    boolean isSafe(int row, int col, char[][] board) {
    for (int i = 0; i < row; i++) {
        if (board[i][col]=='Q') {
            return false; // Another queen is in the same column
        }
    }
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j]=='Q') {
            return false; // Another queen is in the left diagonal
        }
    }
    // Check Right Diagonal Constraint
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
        if (board[i][j]=='Q') {
            return false; // Another queen is in the right diagonal
        }
    }
    return true; // No conflicts found, safe to place queen
}

}