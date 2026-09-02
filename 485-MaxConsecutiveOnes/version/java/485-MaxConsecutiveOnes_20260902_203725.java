// Last updated: 9/2/2026, 8:37:25 PM
1public class Solution {
2    int diameter;
3    public int diameterOfBinaryTree(TreeNode root) {
4        diameter = 0;
5        helper(root);
6        return diameter;
7    }
8    private int helper(TreeNode root) {
9        if (root == null) return 0;
10        int left = helper(root.left);
11        int right = helper(root.right);
12        diameter = Math.max(diameter, left + right);
13        return Math.max(left, right) + 1;
14    }
15}