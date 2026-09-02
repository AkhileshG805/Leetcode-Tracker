// Last updated: 9/2/2026, 9:32:23 AM
1public class Solution {
2    public int longestPalindrome(String s) {
3        HashSet<Character> charSet = new HashSet<>();
4        int length = 0;
5        for (char c : s.toCharArray()) {
6            if (charSet.contains(c)) {
7                charSet.remove(c);
8                length += 2;
9            } else {
10                charSet.add(c);
11            }
12        }
13        if (!charSet.isEmpty()) {
14            length += 1;
15        }
16        return length;
17    }
18}