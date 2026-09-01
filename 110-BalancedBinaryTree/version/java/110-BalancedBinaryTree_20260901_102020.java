// Last updated: 9/1/2026, 10:20:20 AM
1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        return dfsHeight(root) != -1;
4    }
5    private int dfsHeight(TreeNode node) {
6        if (node == null) return 0;
7        int leftHeight = dfsHeight(node.left);
8        if (leftHeight == -1) return -1;
9        int rightHeight = dfsHeight(node.right);
10        if (rightHeight == -1) return -1;
11        if (Math.abs(leftHeight - rightHeight) > 1) {
12            return -1;
13        }
14        return 1 + Math.max(leftHeight, rightHeight);
15    }
16}