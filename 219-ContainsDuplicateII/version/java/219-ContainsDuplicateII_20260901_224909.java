// Last updated: 9/1/2026, 10:49:09 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        Set<Integer> set = new HashSet<Integer>();
4        for(int i = 0; i < nums.length; i++){
5            if(i > k) set.remove(nums[i-k-1]);
6            if(!set.add(nums[i])) return true;
7        }
8        return false;
9 }
10}