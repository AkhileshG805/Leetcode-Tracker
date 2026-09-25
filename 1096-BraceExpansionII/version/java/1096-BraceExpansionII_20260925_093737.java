// Last updated: 9/25/2026, 9:37:37 AM
1class Solution {
2    public int minSumOfLengths(int[] arr, int target) {
3        int n = arr.length;
4        int INF = n + 1;
5        int[] dp = new int[n];
6        for (int i = 0; i < n; i++) {
7            dp[i] = INF;
8        }
9        int left = 0;
10        int sum = 0;
11        int ans = INF;
12        for (int right = 0; right < n; right++) {
13            sum += arr[right];
14            while (sum > target) {
15                sum -= arr[left];
16                left++;
17            }
18            if (sum == target) {
19                int len = right - left + 1;
20                if (left > 0 && dp[left - 1] != INF) {
21                    ans = Math.min(ans, len + dp[left - 1]);
22                }
23                dp[right] = len;
24            }
25            if (right > 0) {
26                dp[right] = Math.min(dp[right], dp[right - 1]);
27            }
28        }
29        return ans == INF ? -1 : ans;
30    }
31}