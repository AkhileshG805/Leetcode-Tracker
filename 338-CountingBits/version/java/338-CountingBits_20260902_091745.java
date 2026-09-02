// Last updated: 9/2/2026, 9:17:45 AM
1class Solution {
2    public int[] countBits(int num) {
3        int[] f = new int[num + 1];
4        for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
5        return f;
6        
7    }
8}