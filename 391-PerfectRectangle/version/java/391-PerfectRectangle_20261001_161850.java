// Last updated: 10/1/2026, 4:18:50 PM
1import java.util.HashSet;
2
3class Solution {
4    public boolean isRectangleCover(int[][] rectangles) {
5        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
6        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
7        long totalArea = 0;
8
9        HashSet<String> cornerSet = new HashSet<>();
10
11        for (int[] rect : rectangles) {
12            int x1 = rect[0], y1 = rect[1];
13            int x2 = rect[2], y2 = rect[3];
14            minX = Math.min(minX, x1);
15            minY = Math.min(minY, y1);
16            maxX = Math.max(maxX, x2);
17            maxY = Math.max(maxY, y2);
18            totalArea += (long) (x2 - x1) * (y2 - y1);
19            String[] corners = {
20                x1 + "," + y1, x1 + "," + y2,
21                x2 + "," + y1, x2 + "," + y2
22            };
23
24            for (String corner : corners) {
25                if (!cornerSet.add(corner)) {
26                    cornerSet.remove(corner);
27                }
28            }
29        }
30        long boundingArea = (long) (maxX - minX) * (maxY - minY);
31        if (totalArea != boundingArea) return false;
32
33        if (cornerSet.size() != 4 || 
34            !cornerSet.contains(minX + "," + minY) ||
35            !cornerSet.contains(minX + "," + maxY) ||
36            !cornerSet.contains(maxX + "," + minY) ||
37            !cornerSet.contains(maxX + "," + maxY)) {
38            return false;
39        }
40
41        return true;
42    }
43}