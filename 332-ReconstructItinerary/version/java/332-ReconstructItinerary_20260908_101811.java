// Last updated: 9/8/2026, 10:18:11 AM
1
2class Solution {
3    HashMap<Integer, Integer> m = new HashMap<>();
4    int[][] dp;
5
6    boolean solve(int i, int k, int[] stones) {
7        if (i == stones.length - 1) {
8            return true;
9        }
10
11        if (dp[i][k] != -1) {
12            return dp[i][k] == 1;
13        }
14
15        boolean k0 = false, kp = false, k1 = false;
16
17        if (m.containsKey(stones[i] + k)) {
18            k0 = solve(m.get(stones[i] + k), k, stones);
19        }
20        if (k > 1 && m.containsKey(stones[i] + k - 1)) {
21            kp = solve(m.get(stones[i] + k - 1), k - 1, stones);
22        }
23        if (m.containsKey(stones[i] + k + 1)) {
24            k1 = solve(m.get(stones[i] + k + 1), k + 1, stones);
25        }
26
27        dp[i][k] = (k0 || kp || k1) ? 1 : 0;
28        return dp[i][k] == 1;
29    }
30
31    public boolean canCross(int[] stones) {
32        if (stones[1] - stones[0] != 1) {
33            return false;
34        }
35
36        for (int i = 0; i < stones.length; i++) {
37            m.put(stones[i], i);
38        }
39
40        dp = new int[stones.length][stones.length];
41        for (int[] row : dp) {
42            Arrays.fill(row, -1);
43        }
44
45        return solve(1, 1, stones);
46    }
47}