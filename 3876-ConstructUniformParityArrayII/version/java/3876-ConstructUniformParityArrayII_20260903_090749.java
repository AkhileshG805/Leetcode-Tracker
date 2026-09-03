// Last updated: 9/3/2026, 9:07:49 AM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int a=nums1[0],odd=0;
4        for(int x:nums1){
5            a=Math.min(a,x);
6            odd |=x&1;
7        }
8        return (a&1)==odd;
9        
10    }
11}