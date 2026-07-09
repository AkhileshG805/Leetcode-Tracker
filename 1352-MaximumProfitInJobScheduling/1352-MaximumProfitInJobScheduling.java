// Last updated: 7/9/2026, 3:11:28 PM
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
         int n = startTime.length;
         int[][] jobs = new int[n][3];
        for(int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }
        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = jobs[0][2];
        for(int i = 1; i < n; i++) {
            int currentProfit = jobs[i][2];
            for(int j = i - 1; j >= 0; j--) {
                if(jobs[j][1] <= jobs[i][0]) {
                    currentProfit += dp[j];
                    break;
                }
            }
            dp[i] = Math.max(dp[i - 1], currentProfit);
        }
        return dp[n - 1];    
    }
}