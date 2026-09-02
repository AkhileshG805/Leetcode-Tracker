// Last updated: 9/2/2026, 8:39:24 PM
1class Solution {
2    public int maxDepth(Node root) {
3        if(root == null) return 0;
4        int maxHeight = 0;
5        for(Node child : root.children){
6            maxHeight = Math.max(maxHeight, maxDepth(child));
7        }
8        return 1 + maxHeight;
9    }
10}