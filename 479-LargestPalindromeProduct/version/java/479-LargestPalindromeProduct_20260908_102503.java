// Last updated: 9/8/2026, 10:25:03 AM
1class Solution {
2
3    public String smallestGoodBase(String n) {
4        long num = Long.parseLong(n);
5
6        int maxLen = 64 - Long.numberOfLeadingZeros(num);
7
8        for (int m = maxLen; m >= 2; m--) {
9
10            long left = 2;
11            long right = (long) Math.pow(num, 1.0 / (m - 1));
12
13            while (left <= right) {
14                long mid = left + (right - left) / 2;
15
16                long sum = geometricSum(mid, m, num);
17
18                if (sum == num) {
19                    return String.valueOf(mid);
20                } else if (sum < num) {
21                    left = mid + 1;
22                } else {
23                    right = mid - 1;
24                }
25            }
26        }
27
28        return String.valueOf(num - 1);
29    }
30
31    private long geometricSum(long base, int len, long limit) {
32        long sum = 1;
33        long curr = 1;
34
35        for (int i = 1; i < len; i++) {
36
37            if (curr > limit / base) {
38                return limit + 1;
39            }
40
41            curr *= base;
42
43            if (sum > limit - curr) {
44                return limit + 1;
45            }
46
47            sum += curr;
48        }
49
50        return sum;
51    }
52}