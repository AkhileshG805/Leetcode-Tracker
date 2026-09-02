// Last updated: 9/2/2026, 8:41:35 PM
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        int m = mat.length;
4        int n = mat[0].length;
5        if (m * n != r * c) return mat;
6        int[][] reshaped = new int[r][c];
7        int count = 0;
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                reshaped[count / c][count % c] = mat[i][j];
11                count++;
12            }
13        }
14        return reshaped;
15    }
16}