// Last updated: 9/2/2026, 8:20:59 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count = 0, ans = 0;
4        for (int num : nums) {
5            if (num == 1) {
6                count++;
7            } else {
8                count = 0;
9            }
10            ans = Math.max(count, ans);
11        }
12        return ans;
13    }
14}