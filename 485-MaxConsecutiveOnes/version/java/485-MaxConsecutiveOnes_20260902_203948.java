// Last updated: 9/2/2026, 8:39:48 PM
1class Solution {
2    public int arrayPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int sum = 0;
5        for (int i = 0; i < nums.length; i += 2) {
6            sum += nums[i];
7        }
8        return sum;
9    }
10}