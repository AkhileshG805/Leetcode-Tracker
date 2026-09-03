// Last updated: 9/3/2026, 9:22:50 AM
1class Solution {
2    private int ans = 0;
3    private void placeQueen(
4        int n,
5        boolean[] ld,
6        boolean[] rd,
7        boolean[] col,
8        int row
9    ) {
10        if (row == n) {
11            ans++;
12            return;
13        }
14        for (int j = 0; j < n; j++) {
15            int leftDiagonal = n - 1 + row - j;
16            int rightDiagonal = row + j;
17            if (col[j] || ld[leftDiagonal] || rd[rightDiagonal])
18                continue;
19            col[j] = true;
20            ld[leftDiagonal] = true;
21            rd[rightDiagonal] = true;
22            placeQueen(n, ld, rd, col, row + 1);
23
24            col[j] = false;
25            ld[leftDiagonal] = false;
26            rd[rightDiagonal] = false;
27        }
28    }
29
30    public int totalNQueens(int n) {
31        boolean[] ld = new boolean[2 * n - 1];
32        boolean[] rd = new boolean[2 * n - 1];
33        boolean[] col = new boolean[n];
34        placeQueen(n, ld, rd, col, 0);
35        return ans;
36    }
37}