// Last updated: 10/1/2026, 4:20:05 PM
1class Solution {
2    public int totalHammingDistance(int[] nums) {
3        int result = 0;
4        for (int i = 0; i < 32; i++) {
5            int bit = 0;
6            for (int num : nums) bit += (num >> i) & 1;
7            result += bit * (nums.length - bit);
8        }
9        return result;
10    }
11}