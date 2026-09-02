// Last updated: 9/2/2026, 8:12:55 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int children = 0;
6        int cookie = 0;
7        while (cookie < s.length && children < g.length) {
8            if (s[cookie] >= g[children]) {
9                children++;
10            }
11            cookie++;
12        }
13        return children;
14    }
15}