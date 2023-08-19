class Solution {
    private int[][] dir = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};

    public void solve(char[][] board) {
        int r=0,c=0;
        markBorderCells(board);
        for(char ar[]:board){
            c=0;
            for(char ch:ar){
                if(ch=='*'){
                    board[r][c]='O';
                }
                else board[r][c]='X';
              c++;  
            }
            r++;
        }
        
    } 
    private void markBorderCells(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < cols; i++) {
            if (board[0][i] == 'O') {
                markhelper(board, 0, i, visited);
            }
            if (board[rows - 1][i] == 'O') {
                markhelper(board, rows - 1, i, visited);
            }
        }
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                markhelper(board, i, 0, visited);
            }
            if (board[i][cols - 1] == 'O') {
                markhelper(board, i, cols - 1, visited);
            }
        }
    }

    private void markhelper(char[][] board, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] == 'X'||board[i][j] == '*') {
            return;
        }
        board[i][j]='*';
        visited[i][j] = true;
        for (int[] d : dir) {
            int newr = i + d[0];
            int newc = j + d[1];
            markhelper(board, newr, newc, visited);
        }
    }
}
