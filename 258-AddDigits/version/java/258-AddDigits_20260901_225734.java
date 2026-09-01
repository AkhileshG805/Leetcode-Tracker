// Last updated: 9/1/2026, 10:57:34 PM
1class Solution {
2    public boolean isUgly(int n) {
3        for (int i=2; i<6 && n>0; i++)
4            while (n % i == 0)
5                n /= i;
6        return n == 1;
7        
8    }
9}