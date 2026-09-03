// Last updated: 9/3/2026, 9:26:48 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
4                s.length() < t.length()) {
5            return new String();
6        }
7        int[] map = new int[128];
8        int count = t.length();
9        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
10        for (char c : t.toCharArray()) {
11            map[c]++;
12        }
13        char[] chS = s.toCharArray();
14        while (end < chS.length) {
15            if (map[chS[end++]]-- > 0) {
16                count--;
17            }
18            while (count == 0) {
19                if (end - start < minLen) {
20                    startIndex = start;
21                    minLen = end - start;
22                }
23                if (map[chS[start++]]++ == 0) {
24                    count++;
25                }
26            }
27        }
28        return minLen == Integer.MAX_VALUE ? new String() :
29                new String(chS, startIndex, minLen);
30    }
31}