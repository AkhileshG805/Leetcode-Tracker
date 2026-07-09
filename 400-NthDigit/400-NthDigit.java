// Last updated: 7/9/2026, 3:12:14 PM
class Solution {
    public int findNthDigit(int n) {
        long digits = 1, count = 9, start = 1;

        while (n > digits * count) {
            n -= digits * count;
            digits++;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / digits;
        String s = Long.toString(start);

        return s.charAt((int)((n - 1) % digits)) - '0';
    }
}