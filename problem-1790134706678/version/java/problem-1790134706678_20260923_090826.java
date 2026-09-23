// Last updated: 9/23/2026, 9:08:26 AM
1class Solution {
2    public int minOperations(int[] A, int x) {
3        int k = -x;
4        for (int a : A)
5            k += a;
6        if (k < 0)
7            return -1;
8
9        int best = -1, i = 0, s = 0, n = A.length;
10        for (int j = 0; j < n; j++) {
11            s += A[j];
12            while (s > k)
13                s -= A[i++];
14
15            if (s == k)
16                best = Math.max(best, j - i + 1);
17        }
18
19        return best < 0 ? -1 : n - best;
20    }
21}