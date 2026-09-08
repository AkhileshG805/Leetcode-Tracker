// Last updated: 9/8/2026, 10:20:39 AM
1import java.util.PriorityQueue;
2
3class Solution {
4    public int trapRainWater(int[][] heightMap) {
5        int m = heightMap.length, n = heightMap[0].length;
6        if (m < 3 || n < 3)
7            return 0;
8
9        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
10        boolean[][] visited = new boolean[m][n];
11
12        for (int i = 0; i < m; i++) {
13            pq.offer(new int[] { heightMap[i][0], i, 0 });
14            pq.offer(new int[] { heightMap[i][n - 1], i, n - 1 });
15            visited[i][0] = visited[i][n - 1] = true;
16        }
17        for (int j = 0; j < n; j++) {
18            pq.offer(new int[] { heightMap[0][j], 0, j });
19            pq.offer(new int[] { heightMap[m - 1][j], m - 1, j });
20            visited[0][j] = visited[m - 1][j] = true;
21        }
22
23        int result = 0;
24        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
25
26        while (!pq.isEmpty()) {
27            int[] cell = pq.poll();
28            int height = cell[0], x = cell[1], y = cell[2];
29
30            for (int[] dir : directions) {
31                int nx = x + dir[0], ny = y + dir[1];
32                if (nx >= 0 && ny >= 0 && nx < m && ny < n && !visited[nx][ny]) {
33                    result += Math.max(0, height - heightMap[nx][ny]);
34                    pq.offer(new int[] { Math.max(height, heightMap[nx][ny]), nx, ny });
35                    visited[nx][ny] = true;
36                }
37            }
38        }
39
40        return result;
41    }
42}