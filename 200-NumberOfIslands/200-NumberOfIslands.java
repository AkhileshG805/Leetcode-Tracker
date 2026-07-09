// Last updated: 7/9/2026, 3:12:43 PM
class Solution {
    public void travel(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') return;
        grid[r][c] = '0';
        travel(grid, r, c + 1);
        travel(grid, r, c - 1);
        travel(grid, r - 1, c);
        travel(grid, r + 1, c);
    }
    public int numIslands(char[][] grid) {
        int a = 0;
        int r = grid.length;
        int c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    a++;
                    travel(grid, i, j);
                }
            }
        }
        return a;
    }
}