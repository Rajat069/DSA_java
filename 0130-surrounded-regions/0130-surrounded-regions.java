class Solution {
    private HashSet<Pair<Integer, Integer>> hs = new HashSet<>();
    private int[][] dir = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};

    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        markBorderCells(board);

        char[][] boardSol = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O' && !hs.contains(new Pair<>(i, j))) {
                    boolean r = false, l = false, u = false, d = false;

                    for (int q = j; q < cols; q++) {
                        if (board[i][q] == 'X' && !hs.contains(new Pair<>(i, q))) {
                            r = true;
                            break;
                        }
                    }

                    for (int q = j; q >= 0; q--) {
                        if (board[i][q] == 'X' && !hs.contains(new Pair<>(i, q))) {
                            l = true;
                            break;
                        }
                    }

                    for (int q = i; q < rows; q++) {
                        if (board[q][j] == 'X' && !hs.contains(new Pair<>(q, j))) {
                            d = true;
                            break;
                        }
                    }

                    for (int q = i; q >= 0; q--) {
                        if (board[q][j] == 'X' && !hs.contains(new Pair<>(q, j))) {
                            u = true;
                            break;
                        }
                    }

                    if (r && l && u && d) {
                        boardSol[i][j] = 'X';
                    } else {
                        boardSol[i][j] = board[i][j];
                    }
                } else {
                    boardSol[i][j] = board[i][j];
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = boardSol[i][j];
            }
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
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] == 'X') {
            return;
        }
        hs.add(new Pair<>(i, j));
        visited[i][j] = true;
        for (int[] d : dir) {
            int newr = i + d[0];
            int newc = j + d[1];
            markhelper(board, newr, newc, visited);
        }
    }
}
