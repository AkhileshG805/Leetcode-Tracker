// Last updated: 9/2/2026, 8:14:59 PM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int val = x ^ y;
4        int count = 0;
5        while (val > 0) {
6            if (val % 2 == 1)
7                count++;
8            val = val / 2;
9        }
10        return count;
11    }
12}