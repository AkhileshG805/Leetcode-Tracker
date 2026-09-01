// Last updated: 9/1/2026, 9:52:40 AM
1class Solution {
2    public int maxDepth(TreeNode root) {
3        if (root == null) {
4            return 0;
5        }
6
7        Queue<TreeNode> queue = new LinkedList<>();
8        queue.add(root);
9        int depth = 0;
10
11        while (!queue.isEmpty()) {
12            depth++;
13            int levelSize = queue.size();
14
15            for (int i = 0; i < levelSize; i++) {
16                TreeNode node = queue.poll();
17                if (node.left != null) {
18                    queue.add(node.left);
19                }
20                if (node.right != null) {
21                    queue.add(node.right);
22                }
23            }
24        }
25
26        return depth;        
27    }
28}