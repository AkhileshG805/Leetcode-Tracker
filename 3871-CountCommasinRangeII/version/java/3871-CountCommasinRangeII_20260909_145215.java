// Last updated: 9/9/2026, 2:52:15 PM
1class Solution {
2    public long countCommas(long n) {
3        long count = 0;
4        for (long p = 1000; p <= n; p *= 1000)
5            count += n - p + 1;
6        return count;
7    }
8}