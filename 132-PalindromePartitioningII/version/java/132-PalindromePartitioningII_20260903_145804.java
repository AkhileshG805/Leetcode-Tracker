// Last updated: 9/3/2026, 2:58:04 PM
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3        int n = prices.length;
4        int[][][] dp = new int[n][2][k+1];
5        for(int i=0;i<n;i++){
6            for(int j=0;j<2;j++){
7                Arrays.fill(dp[i][j], -1);
8            }
9        }
10        return helper(0, 1, k, prices, dp);
11    }
12    private int helper(int idx, int canBuy, int k, int[] prices, int[][][] dp){
13        if(idx == prices.length) return 0;
14        if(k == 0) return 0;
15        if(dp[idx][canBuy][k] != -1) return dp[idx][canBuy][k];
16        int profit = 0;
17        if(canBuy == 1){
18            profit = Math.max(-prices[idx] + helper(idx+1, 0, k, prices, dp), 0 + helper(idx+1, 1, k, prices, dp));
19        }
20        else{
21            profit = Math.max(prices[idx] + helper(idx+1, 1, k-1, prices, dp), 0 + helper(idx+1, 0, k, prices, dp));
22        }
23        return dp[idx][canBuy][k] = profit;
24    }
25}