// Last updated: 7/9/2026, 3:13:55 PM
class Solution {
    public int climbStairs(int n) {

        if (n <= 2)
            return n;

        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}