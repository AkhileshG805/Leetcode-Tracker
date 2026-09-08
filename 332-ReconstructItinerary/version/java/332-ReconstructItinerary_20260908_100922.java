// Last updated: 9/8/2026, 10:09:22 AM
1public class Solution {
2    public boolean isSelfCrossing(int[] x) {
3        if (x.length <= 3) {
4            return false;
5        }
6        int i = 2;
7        while (i < x.length && x[i] > x[i - 2]) {
8            i++;
9        }
10        if (i >= x.length) {
11            return false;
12        }
13        if ((i >= 4 && x[i] >= x[i - 2] - x[i - 4]) ||
14                (i == 3 && x[i] == x[i - 2])) {
15            x[i - 1] -= x[i - 3];
16        }
17        i++;
18        while (i < x.length) {
19            if (x[i] >= x[i - 2]) {
20                return true;
21            }
22            i++;
23        }
24        return false;
25    }
26}