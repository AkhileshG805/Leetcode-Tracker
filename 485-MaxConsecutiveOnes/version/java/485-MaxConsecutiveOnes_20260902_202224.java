// Last updated: 9/2/2026, 8:22:24 PM
1class Solution {
2    public int[] constructRectangle(int area) {
3        int width = (int) Math.sqrt(area);
4        while (area % width != 0) {
5            width--;
6        }
7        return new int[] { area / width, width };
8    }
9}