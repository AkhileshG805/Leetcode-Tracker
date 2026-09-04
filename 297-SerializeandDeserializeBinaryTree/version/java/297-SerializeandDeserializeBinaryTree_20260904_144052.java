// Last updated: 9/4/2026, 2:40:52 PM
1
2class Solution {
3    int[] bit = new int[20002];
4
5    void add(int i) {
6        while (i < bit.length) {
7            bit[i]++;
8            i += i & -i;
9        }
10    }
11
12    int sum(int i) {
13        int s = 0;
14        while (i > 0) {
15            s += bit[i];
16            i -= i & -i;
17        }
18        return s;
19    }
20
21    public List<Integer> countSmaller(int[] nums) {
22        int n = nums.length;
23        Integer[] ans = new Integer[n];
24
25        for (int i = n - 1; i >= 0; i--) {
26            int x = nums[i] + 10001;
27
28            ans[i] = sum(x);
29            add(x + 1);
30        }
31
32        return Arrays.asList(ans);
33    }
34}