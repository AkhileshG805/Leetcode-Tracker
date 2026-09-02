// Last updated: 9/2/2026, 8:34:16 PM
1class Solution {
2    int prev = Integer.MAX_VALUE;
3    int ans = Integer.MAX_VALUE;
4    public int getMinimumDifference(TreeNode root) {
5        inOrder(root);
6        return ans;
7    }
8    
9    public void inOrder(TreeNode root){
10        if(root.left!=null) inOrder(root.left);
11        ans = Math.min(ans,Math.abs(root.val-prev));
12        prev = root.val;
13        if(root.right!=null) inOrder(root.right);
14    }
15}