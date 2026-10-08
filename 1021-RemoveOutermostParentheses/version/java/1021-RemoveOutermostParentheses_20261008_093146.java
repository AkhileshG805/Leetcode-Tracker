// Last updated: 10/8/2026, 9:31:46 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        String ans = "";
4        int count = 0;
5        for (char c : s.toCharArray()) {
6            if (c == '(') {
7                if (count > 0)
8                    ans += c;
9                count++;
10            } else {
11                count--;
12                if (count > 0)
13                    ans += c;
14            }
15        }
16        return ans;
17    }
18}