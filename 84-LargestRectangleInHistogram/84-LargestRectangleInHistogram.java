// Last updated: 7/9/2026, 3:13:46 PM
class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i = 0; i <= h.length; i++) {
            int cur = (i == h.length) ? 0 : h[i];
            while (!st.isEmpty() && cur < h[st.peek()]) {
                int height = h[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                max = Math.max(max, height * width);
            }
            st.push(i);
        }
        return max;
    }
}