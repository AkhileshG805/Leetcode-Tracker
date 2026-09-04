// Last updated: 9/4/2026, 2:40:18 PM
1class Solution {
2    public int maxCoins(int[] nums) {
3        int n = nums.length;
4        int arr[] = new int[n+2];
5        arr[0] = arr[n+1] = 1;
6        for(int i=1;i<=n;i++){
7            arr[i] = nums[i-1];
8        }
9        
10        int memo[][] = new int[n+2][n+2];
11        return burst(memo, arr, 0, n + 1);
12        
13    }
14    public int burst(int[][] memo, int[] nums, int left, int right) {
15        if (left + 1 == right) return 0;
16        
17        if (memo[left][right] > 0) return memo[left][right];
18        
19        int ans = 0;
20        
21        for (int i = left + 1; i < right; ++i){
22            ans = Math.max(ans, nums[left] * nums[i] * nums[right] 
23            + burst(memo, nums, left, i) + burst(memo, nums, i, right));
24        }
25        memo[left][right] = ans;
26        
27        return ans;
28    }
29    
30}