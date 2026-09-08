// Last updated: 9/8/2026, 10:15:05 AM
1class Solution {
2    public int maxSumSubmatrix(int[][] matrix, int tar) {
3        int n=matrix.length,m=matrix[0].length,i,j,k,l,dp[][] = new int[n][m],val,max=Integer.MIN_VALUE,target=tar;
4        for(i=0;i<n;i++){
5            for(j=0;j<m;j++){
6                dp[i][j]=matrix[i][j];
7                if(j>0) dp[i][j]+=dp[i][j-1];
8            }
9        }
10        for(i=0;i<n;i++){
11            for(j=0;j<m;j++){
12                if(i>0) dp[i][j]+=dp[i-1][j];
13            }
14        }
15        for(i=0;i<n;i++){
16            for(j=0;j<m;j++){
17                for(k=i;k<n;k++){
18                    for(l=j;l<m;l++){
19                        val=dp[k][l];
20                        if((i-1)>=0 && (j-1)>=0) val += dp[i-1][j-1];
21                        if((i-1)>=0) val=val-dp[i-1][l];
22                        if((j-1)>=0) val=val-dp[k][j-1];
23                        if(val>max && val<=target) max=val;
24                    }
25                }
26            }
27        }
28        return max;
29    }
30}