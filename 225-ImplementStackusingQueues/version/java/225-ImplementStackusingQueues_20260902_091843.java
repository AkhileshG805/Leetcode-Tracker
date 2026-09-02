// Last updated: 9/2/2026, 9:18:43 AM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        if (num == 1) return true;
4        long left = 1;
5        long right = num / 2;
6        while (left <= right) {
7            long mid = left + (right - left) / 2;
8            if (mid * mid == num) {
9                return true;
10            } else if (mid * mid > num) {
11                right = mid - 1;
12            } else {
13                left = mid + 1;
14            }
15        }
16        return false;
17    }
18}