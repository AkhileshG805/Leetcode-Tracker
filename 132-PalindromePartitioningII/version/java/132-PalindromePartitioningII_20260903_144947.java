// Last updated: 9/3/2026, 2:49:47 PM
1class Solution {
2    public int minCut(String s) {
3        int n = s.length();
4        if (n <= 1) return 0;
5        boolean[][] isPal = new boolean[n][n];
6        for (int end = 0; end < n; end++) {
7            for (int start = 0; start <= end; start++) {
8                if (s.charAt(start) == s.charAt(end) && 
9                   (end - start <= 2 || isPal[start + 1][end - 1])) {
10                    isPal[start][end] = true;
11                }
12            }
13        }
14        int[] dp = new int[n];
15        for (int i = 0; i < n; i++) {
16            if (isPal[0][i]) {
17                dp[i] = 0; 
18            } else {
19                dp[i] = i; 
20                for (int j = 0; j < i; j++) {
21                    if (isPal[j + 1][i]) {
22                        dp[i] = Math.min(dp[i], dp[j] + 1);
23                    }
24                }
25            }
26        }
27        return dp[n - 1];
28    }
29}