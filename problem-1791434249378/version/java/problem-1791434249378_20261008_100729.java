// Last updated: 10/8/2026, 10:07:29 AM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        Arrays.sort(nums);
4        int x = k;
5        for (int i = 0; i < nums.length; i++) {
6            if (nums[i] == x)
7                x += k;
8        }
9        return x;
10    }
11}