// Last updated: 9/24/2026, 9:53:18 AM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for (int i = 0; i < nums.length; ++i) {
4            int x = nums[i];
5            int sum = 0;
6            while (x > 0) {
7                sum += x % 10;
8                x /= 10;
9            }
10            if (sum == i) return i;
11        }
12        return -1;
13    }
14}