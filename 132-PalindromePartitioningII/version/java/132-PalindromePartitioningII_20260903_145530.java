// Last updated: 9/3/2026, 2:55:30 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int l = 0;
4        int r = nums.length - 1;
5        while (l < r) {
6            int mid = l + (r - l) / 2;
7            if (nums[mid] < nums[r]) {
8                r = mid;
9            }
10            else if (nums[mid] > nums[r]) {
11                l = mid + 1;
12            }
13           else {
14                r--;
15            }
16        }
17        return nums[l];
18    }
19}