// Last updated: 9/2/2026, 8:19:02 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {        
3        StringBuilder sb = new StringBuilder();
4        for (int i = s.length() - 1; i >= 0; i--) {
5            char ch = s.charAt(i);
6            if (ch != '-') {
7                if (sb.length() % (k + 1) == k) {
8                    sb.append('-');
9                }       
10                sb.append(Character.toUpperCase(ch));
11            }
12        }
13        return sb.reverse().toString();
14    }
15}