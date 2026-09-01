// Last updated: 9/1/2026, 11:54:57 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> postorderTraversal(TreeNode root) {
18	LinkedList<Integer> ans = new LinkedList<>();
19	Stack<TreeNode> stack = new Stack<>();
20	if (root == null) return ans;
21	
22	stack.push(root);
23	while (!stack.isEmpty()) {
24		TreeNode cur = stack.pop();
25		ans.addFirst(cur.val);
26		if (cur.left != null) {
27			stack.push(cur.left);
28		}
29		if (cur.right != null) {
30			stack.push(cur.right);
31		} 
32	}
33	return ans;
34}
35}