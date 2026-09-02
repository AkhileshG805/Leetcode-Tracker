// Last updated: 9/2/2026, 9:29:20 AM
1class Solution {
2    public int sumOfLeftLeaves(TreeNode root) {
3        if (root == null) return 0;
4        Queue<Pair<TreeNode, Boolean>> queue = new LinkedList<>();
5        queue.offer(new Pair<>(root, false));  
6        int totalSum = 0;
7        while (!queue.isEmpty()) {
8            Pair<TreeNode, Boolean> pair = queue.poll();
9            TreeNode node = pair.getKey();
10            boolean isLeft = pair.getValue();
11            if (isLeft && node.left == null && node.right == null) {
12                totalSum += node.val;
13            }
14            if (node.left != null) {
15                queue.offer(new Pair<>(node.left, true));
16            }
17            if (node.right != null) {
18                queue.offer(new Pair<>(node.right, false));
19            }
20        }
21        return totalSum;
22    }
23}