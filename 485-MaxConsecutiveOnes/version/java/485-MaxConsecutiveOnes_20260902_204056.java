// Last updated: 9/2/2026, 8:40:56 PM
1class Solution {
2    int ans = 0;
3    public int findTilt(TreeNode root) {
4        helper(root);
5        return ans;
6    }
7    public int helper(TreeNode root) {
8        if (root == null) return 0;
9        int left = helper(root.left);
10        int right = helper(root.right);
11        ans += Math.abs(left - right);
12        return root.val + left + right;
13    }
14}