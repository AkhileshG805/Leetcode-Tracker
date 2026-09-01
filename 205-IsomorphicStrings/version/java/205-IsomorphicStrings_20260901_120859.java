// Last updated: 9/1/2026, 12:08:59 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        int[] indexS = new int[200]; 
4        int[] indexT = new int[200]; 
5        int len = s.length();
6        if(len != t.length()) {
7            return false;
8        }
9        for(int i = 0; i < len; i++) {
10            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
11                return false;
12            }
13            indexS[s.charAt(i)] = i + 1; 
14            indexT[t.charAt(i)] = i + 1; 
15        }
16        return true;
17    }
18}
19