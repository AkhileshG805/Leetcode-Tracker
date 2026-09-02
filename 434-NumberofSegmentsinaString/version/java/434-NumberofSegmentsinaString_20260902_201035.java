// Last updated: 9/2/2026, 8:10:35 PM
1class Solution {
2    public int countSegments(String s) {
3        String[] words = s.split(" ");
4        int count = 0;
5        for (String word : words) {
6            if (!word.isEmpty()) {
7                count++;
8            }
9        }
10        return count;
11    }
12}