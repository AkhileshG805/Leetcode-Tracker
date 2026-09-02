// Last updated: 9/2/2026, 8:16:19 PM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int row = grid.length;
4        int col = grid[0].length;
5        int perimeter = 0;
6        for (int i = 0; i < row; i++) {
7            for (int j = 0; j < col; j++) {
8                if (grid[i][j] == 1) {
9                    if (i == 0 || grid[i - 1][j] == 0) {
10                        perimeter++;
11                    }
12                    if (i == row - 1 || grid[i + 1][j] == 0) {
13                        perimeter++;
14                    }
15                    if (j == 0 || grid[i][j - 1] == 0) {
16                        perimeter++;
17                    }
18                    if (j == col - 1 || grid[i][j + 1] == 0) {
19                        perimeter++;
20                    }
21                }
22            }
23        }
24        return perimeter;
25    }
26}