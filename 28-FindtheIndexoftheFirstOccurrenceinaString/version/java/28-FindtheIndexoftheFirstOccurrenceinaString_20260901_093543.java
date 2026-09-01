// Last updated: 9/1/2026, 9:35:43 AM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        int haylength=haystack.length();
4        int needlelength=needle.length();
5        if(haylength<needlelength)
6            return -1;
7        for(int i=0;i<=haystack.length()-needle.length();i++){
8            int j=0;
9            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
10                j++;
11            if(j==needle.length()){
12                return i;
13            }
14        }
15        return -1;
16    }
17}