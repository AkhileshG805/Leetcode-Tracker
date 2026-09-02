// Last updated: 9/2/2026, 8:32:00 PM
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        int n = score.length;
4        int[][] sortedPairs = new int[n][2];
5        for (int i = 0 ; i < n ; i++) sortedPairs[i] = new int[] {i, score[i]};
6        Arrays.sort(sortedPairs, (x, y) -> (y[1] - x[1]));
7        String[] ans = new String[n];
8        for (int i = 0 ; i < n ; i++) {
9            if (i == 0) {
10                ans[sortedPairs[i][0]] = "Gold Medal";
11            } else if (i == 1) {
12                ans[sortedPairs[i][0]] = "Silver Medal";
13            } else if (i == 2) {
14                ans[sortedPairs[i][0]] = "Bronze Medal";
15            } else {
16                ans[sortedPairs[i][0]] = String.valueOf(i+1);
17            }
18        }
19        return ans;
20    }
21}