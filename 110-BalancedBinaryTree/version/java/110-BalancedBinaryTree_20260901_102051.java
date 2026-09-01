// Last updated: 9/1/2026, 10:20:51 AM
1public class Solution {
2    public int minDepth(TreeNode root) {
3        if(root == null) return 0;
4        int left = minDepth(root.left);
5        int right = minDepth(root.right);
6        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;
7       
8    }
9}