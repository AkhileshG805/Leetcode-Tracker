// Last updated: 9/2/2026, 8:09:32 PM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        int upper = 0;
4        for (char ch : word.toCharArray()) {
5            if (Character.isUpperCase(ch)) {
6                upper++;
7            }
8        }
9        return upper == 0
10            || upper == word.length()
11            || (upper == 1 && Character.isUpperCase(word.charAt(0)));
12    }
13}