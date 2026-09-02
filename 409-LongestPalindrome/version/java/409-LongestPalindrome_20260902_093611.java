// Last updated: 9/2/2026, 9:36:11 AM
1class Solution {
2    public int thirdMax(int[] nums) {
3       long max1 = Long.MIN_VALUE;
4        long max2 = Long.MIN_VALUE;
5        long max3 = Long.MIN_VALUE;
6        for (int num : nums) {
7            if (num == max1 || num == max2 || num == max3) {
8                continue;
9            }
10            if (num > max1) {
11                max3 = max2;
12                max2 = max1;
13                max1 = num;
14            } else if (num > max2) {
15                max3 = max2;
16                max2 = num;
17            } else if (num > max3) {
18                max3 = num;
19            }
20        }
21        return (max3 == Long.MIN_VALUE) ? (int) max1 : (int) max3;
22    }
23}