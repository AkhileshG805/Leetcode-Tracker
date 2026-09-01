// Last updated: 9/1/2026, 11:00:36 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        if (nums == null || nums.length == 0) return;        
4        int insertPos = 0;
5        for (int num: nums) {
6            if (num != 0) nums[insertPos++] = num;
7        }        
8        while (insertPos < nums.length) {
9            nums[insertPos++] = 0;
10        }
11    }
12}