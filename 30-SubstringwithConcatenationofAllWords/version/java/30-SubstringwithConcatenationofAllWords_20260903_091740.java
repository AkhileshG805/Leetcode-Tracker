// Last updated: 9/3/2026, 9:17:40 AM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int[] filteredNums = Arrays.stream(nums).filter(n -> n > 0).toArray();        
4        Arrays.sort(filteredNums);
5        int target = 1;
6        for (int n : filteredNums) {
7            if (n == target) {
8                target++;
9            } else if (n > target) {
10                return target;
11            }
12        }
13        return target;        
14    }
15}