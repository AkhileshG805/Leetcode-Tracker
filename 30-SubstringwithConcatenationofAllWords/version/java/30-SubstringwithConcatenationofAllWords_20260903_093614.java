// Last updated: 9/3/2026, 9:36:14 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int[] suffixProfit = new int[n];
5        int maxPrice = prices[n - 1];
6        for (int i = n - 1; i >= 0; i--) {
7            maxPrice = Math.max(maxPrice, prices[i]);
8            suffixProfit[i] = maxPrice - prices[i];
9        }
10        int minPrice = prices[0];
11        int prefixProfit = 0;
12        int answer = suffixProfit[0];
13        for (int i = 1; i < n; i++) {
14            prefixProfit = Math.max(prefixProfit, prices[i] - minPrice);
15            minPrice = Math.min(minPrice, prices[i]);
16            answer = Math.max(answer, prefixProfit + suffixProfit[i]);
17        }
18        return answer;
19    }
20}