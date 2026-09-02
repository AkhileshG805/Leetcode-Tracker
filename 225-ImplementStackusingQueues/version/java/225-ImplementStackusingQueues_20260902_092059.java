// Last updated: 9/2/2026, 9:20:59 AM
1public class Solution extends GuessGame {
2    public int guessNumber(int n) {
3        int left = 1;
4        int right = n;
5        while (left <= right) {
6            int middle = left + (right - left) / 2;
7            int rez = guess(middle);
8            if (rez == 0) {
9                return middle;
10            } else if (rez == -1) {
11                right = middle - 1;
12            } else {
13                left = middle + 1;
14            }
15        }
16        return -1;
17    }
18}