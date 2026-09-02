// Last updated: 9/2/2026, 11:17:24 AM
1class Solution {
2    public String addStrings(String num1, String num2) {
3        int i = num1.length() - 1, j = num2.length() - 1;
4        int carry = 0;
5        StringBuilder result = new StringBuilder();
6        while (i >= 0 || j >= 0 || carry != 0) {
7            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
8            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
9            int total = digit1 + digit2 + carry;
10            carry = total / 10;
11            result.append(total % 10);
12            i--;
13            j--;
14        }
15        return result.reverse().toString();
16    }
17}