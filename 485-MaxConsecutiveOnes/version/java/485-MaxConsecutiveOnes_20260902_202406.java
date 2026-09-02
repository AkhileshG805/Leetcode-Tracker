// Last updated: 9/2/2026, 8:24:06 PM
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        int total = 0;
4        for (int i = 0; i < timeSeries.length-1; i++) {
5            if (timeSeries[i+1] <= timeSeries[i] + duration-1) {
6                total += timeSeries[i+1] - timeSeries[i];
7            } else { 
8                total += duration;
9            }
10        }
11        total += duration; 
12        return total;
13    }
14}