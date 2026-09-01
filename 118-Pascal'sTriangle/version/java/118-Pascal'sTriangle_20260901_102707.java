// Last updated: 9/1/2026, 10:27:07 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int lsf = Integer.MAX_VALUE;
4        int op = 0;
5        int pist = 0;
6        
7        for(int i = 0; i < prices.length; i++){
8            if(prices[i] < lsf){
9                lsf = prices[i];
10            }
11            pist = prices[i] - lsf;
12            if(op < pist){
13                op = pist;
14            }
15        }
16        return op;
17    }
18}