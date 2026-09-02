// Last updated: 9/2/2026, 9:26:20 AM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3		if (ransomNote.length() > magazine.length()) return false;
4        int[] alphabets_counter = new int[26];
5        for (char c : magazine.toCharArray())
6            alphabets_counter[c-'a']++;
7        for (char c : ransomNote.toCharArray()){
8            if (alphabets_counter[c-'a'] == 0) return false;
9            alphabets_counter[c-'a']--;
10        }
11        return true;
12    }
13}