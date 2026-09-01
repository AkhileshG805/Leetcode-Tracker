// Last updated: 9/1/2026, 10:54:52 PM
1class Solution {
2    public List<String> binaryTreePaths(TreeNode root) {
3    List<String> answer = new ArrayList<String>();
4    if (root != null) searchBT(root, "", answer);
5    return answer;
6}
7private void searchBT(TreeNode root, String path, List<String> answer) {
8    if (root.left == null && root.right == null) answer.add(path + root.val);
9    if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
10    if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
11}
12}