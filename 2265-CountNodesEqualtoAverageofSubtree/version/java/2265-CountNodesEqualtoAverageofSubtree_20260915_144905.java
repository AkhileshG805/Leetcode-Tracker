// Last updated: 9/15/2026, 2:49:05 PM
1class Solution {
2    public int largestOverlap(int[][] img1, int[][] img2) {
3        int n = img1.length;
4
5        List<int[]> ones1 = new ArrayList<>();
6        List<int[]> ones2 = new ArrayList<>();
7
8        for (int r = 0; r < n; r++) {
9            for (int c = 0; c < n; c++) {
10                if (img1[r][c] == 1) ones1.add(new int[]{r, c});
11                if (img2[r][c] == 1) ones2.add(new int[]{r, c});
12            }
13        }
14
15        Map<Integer, Integer> frequency = new HashMap<>();
16        int maxOverlap = 0;
17
18        for (int[] p1 : ones1) {
19            for (int[] p2 : ones2) {
20                int dr = p1[0] - p2[0];
21                int dc = p1[1] - p2[1];
22
23                int key = dr * 100 + dc;
24
25                int count = frequency.merge(key, 1, Integer::sum);
26                maxOverlap = Math.max(maxOverlap, count);
27            }
28        }
29
30        return maxOverlap;
31    }
32}