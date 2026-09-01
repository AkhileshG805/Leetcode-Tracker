// Last updated: 9/1/2026, 10:19:09 AM
1// Definition for a binary tree node.
2public class TreeNode {
3    int val;
4    TreeNode left;
5    TreeNode right;
6    TreeNode() {}
7    TreeNode(int val) { this.val = val; }
8    TreeNode(int val, TreeNode left, TreeNode right) {
9        this.val = val;
10        this.left = left;
11        this.right = right;
12    }
13}
14
15class Solution {
16    public TreeNode sortedArrayToBST(int[] nums) {
17        return helper(nums, 0, nums.length - 1);
18    }
19
20    private TreeNode helper(int[] nums, int left, int right) {
21        if (left > right) return null;
22        int mid = (left + right) / 2;
23        TreeNode root = new TreeNode(nums[mid]);
24        root.left = helper(nums, left, mid - 1);
25        root.right = helper(nums, mid + 1, right);
26        return root;
27    }
28}