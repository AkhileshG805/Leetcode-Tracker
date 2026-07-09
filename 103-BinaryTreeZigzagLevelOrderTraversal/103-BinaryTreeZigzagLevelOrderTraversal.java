// Last updated: 7/9/2026, 3:13:35 PM
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ab = new ArrayList<>();
        if (root == null) return ab;
        boolean leftToRight = true;
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode del = q.poll();
                a.add(del.val);
                if (del.left != null) q.offer(del.left);
                if (del.right != null) q.offer(del.right);
            }
            if (!leftToRight) Collections.reverse(a);
            ab.add(a);
            leftToRight = !leftToRight;
        }
        return ab;
    }
}