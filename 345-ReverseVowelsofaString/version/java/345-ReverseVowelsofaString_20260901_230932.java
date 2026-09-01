// Last updated: 9/1/2026, 11:09:32 PM
1class Solution {
2    public String reverseVowels(String s) {
3        char[] chars = s.toCharArray();
4        int start = 0 ;
5        int end = s.length()-1;
6        while (start<end){
7            while (start < end && !isVowel(chars[start])) {
8                start++;
9            }
10            while (start < end && !isVowel(chars[end])) {
11                end--;
12            }
13            if (start < end) {
14                swap(chars, start, end);
15                start++;
16                end--;
17            }
18        }
19        return new String(chars);
20    }
21    private void swap(char[] word, int start, int end){
22        char temp = word[start];
23        word[start] = word[end];
24        word[end] = temp;
25    }
26    private boolean isVowel(char c) {
27        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
28                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
29    }
30}