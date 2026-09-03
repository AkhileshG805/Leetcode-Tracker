// Last updated: 9/3/2026, 9:13:03 AM
1import java.util.Stack;
2
3class Solution {
4    public int longestValidParentheses(String s) {
5        Stack<Integer> stack = new Stack<>();
6        stack.push(-1);  
7        int maxLength = 0;
8        for (int i = 0; i < s.length(); i++) {
9            if (s.charAt(i) == '(') {
10                stack.push(i);
11            } else {
12                stack.pop();
13                if (stack.isEmpty()) {
14                    stack.push(i);
15                } else {
16                    maxLength = Math.max(maxLength, i - stack.peek());
17                }
18            }
19        }
20        return maxLength;
21    }
22}