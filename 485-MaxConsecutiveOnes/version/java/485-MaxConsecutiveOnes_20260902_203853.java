// Last updated: 9/2/2026, 8:38:53 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split(" ");
4        StringBuilder result = new StringBuilder();
5        for (String word : words) {
6            StringBuilder reversedWord = new StringBuilder(word).reverse();
7            result.append(reversedWord).append(" ");
8        }
9        result.deleteCharAt(result.length() - 1);  
10        return result.toString();        
11    }
12}