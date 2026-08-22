# Last updated: 8/22/2026, 9:23:27 AM
1class Solution(object):
2    def containsDuplicate(self, nums):
3        return len(nums)!=len(set(nums))
4