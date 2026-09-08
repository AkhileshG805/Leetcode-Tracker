// Last updated: 9/8/2026, 10:00:50 AM
1class Solution {
2    public int countCommas(int n) {
3        int count = 0;
4        for (int i = 1; i <= n; i++) {
5            if (i >= 1000) {
6                count++;
7            }
8        }
9        return count;
10    }
11}