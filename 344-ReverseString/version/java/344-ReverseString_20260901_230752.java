// Last updated: 9/1/2026, 11:07:52 PM
1class Solution {
2    public void reverseString(char[] s) {
3        int left=0;int right=s.length-1;
4        while(left<right){
5        char temp=s[left];
6        s[left]=s[right];
7        s[right]=temp;left++;right--;
8       } 
9    }
10}