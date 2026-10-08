// Last updated: 10/8/2026, 9:54:21 AM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        int n = k;
4        while (true) {
5            boolean found = false;
6            for (int x : nums) {
7                if (x == n) {
8                    found = true;
9                    break;
10                }
11            }
12            if (!found)
13                return n;
14            n += k;
15        }
16    }
17}