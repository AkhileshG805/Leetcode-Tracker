// Last updated: 10/9/2026, 10:04:26 AM
1class Solution {
2    public int minInsertions(String s) {
3        int open = 0, ans = 0;
4        for (int i = 0; i < s.length(); i++) {
5            if (s.charAt(i) == '(') {
6                open++;
7            } else {
8                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
9                    i++;
10                } else {
11                    ans++;
12                }
13                if (open > 0) {
14                    open--;
15                } else {
16                    ans++;
17                }
18            }
19        }
20        return ans + open * 2;
21    }
22}