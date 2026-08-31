// Last updated: 8/31/2026, 4:24:52 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int index = 0;
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] != val) {
6                nums[index] = nums[i];
7                index++;
8            }
9        }
10        return index;
11    }
12}