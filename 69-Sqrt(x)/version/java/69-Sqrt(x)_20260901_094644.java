// Last updated: 9/1/2026, 9:46:44 AM
1class Solution {
2    public int mySqrt(int x) {
3        int low = 0, high = x, ans = -1;
4        while (low <= high) {
5            long mid = (low + high) / 2;
6            long midsq = mid * mid;
7            if (midsq == x)
8                return (int)mid;
9            else if (midsq > x)
10                high = (int)mid - 1;
11            else {
12                ans = (int)mid;
13                low = (int)mid + 1;
14            }
15        }
16        return ans;
17    }
18}