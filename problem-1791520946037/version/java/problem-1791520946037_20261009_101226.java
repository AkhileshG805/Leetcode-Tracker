// Last updated: 10/9/2026, 10:12:26 AM
1class Solution {
2    public String reverseParentheses(String s) {
3        StringBuilder ans = new StringBuilder();
4        for (char c : s.toCharArray()) {
5            if (c == ')') {
6                StringBuilder temp = new StringBuilder();
7                while (ans.length() > 0 && ans.charAt(ans.length() - 1) != '(') {
8                    temp.append(ans.charAt(ans.length() - 1));
9                    ans.deleteCharAt(ans.length() - 1);
10                }
11                ans.deleteCharAt(ans.length() - 1);
12                ans.append(temp);
13            } else {
14                ans.append(c);
15            }
16        }
17        return ans.toString();
18    }
19}