class Solution {
    public int islandPerimeter(int[][] grid) {
        int per = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    per += NeighbourIslands(grid, i, j);
            }
        }
        return per;
    }

    // Helper method to calculate the number of neighboring islands
    public int NeighbourIslands(int[][] grid, int i, int j) {
        int nc = 0;

        // Check if the cell above contains an island
        if (i - 1 >= 0 && i - 1 < grid.length) {
            if (grid[i - 1][j] == 1)
                nc++;
        }

        // Check if the cell below contains an island
        if (i + 1 >= 0 && i + 1 < grid.length) {
            if (grid[i + 1][j] == 1)
                nc++;
        }

        // Check if the cell to the left contains an island
        if (j - 1 >= 0 && j - 1 < grid[0].length) {
            if (grid[i][j - 1] == 1)
                nc++;
        }

        // Check if the cell to the right contains an island
        if (j + 1 >= 0 && j + 1 < grid[0].length) {
            if (grid[i][j + 1] == 1)
                nc++;
        }

        // Return the number of neighboring cells that do not contain an island
        return 4 - nc;
    }
}
