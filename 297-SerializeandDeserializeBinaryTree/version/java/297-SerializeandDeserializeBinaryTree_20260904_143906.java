// Last updated: 9/4/2026, 2:39:06 PM
1public class Codec {
2
3    // Encodes a tree to a single string.
4    public String serialize(TreeNode root) {
5        if (root == null) return "null";
6
7        StringBuilder sb = new StringBuilder();
8        Queue<TreeNode> q = new LinkedList<>();
9        q.add(root);
10
11        while (!q.isEmpty()) {
12            TreeNode curr = q.poll();
13
14            if (curr == null) {
15                sb.append("null,");
16                continue;
17            }
18
19            sb.append(curr.val).append(",");
20            q.add(curr.left);
21            q.add(curr.right);
22        }
23
24        return sb.toString();
25    }
26
27    // Decodes your encoded data to tree.
28    public TreeNode deserialize(String data) {
29        if (data.equals("null")) return null;
30
31        String[] arr = data.split(",");
32        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
33        Queue<TreeNode> q = new LinkedList<>();
34        q.add(root);
35        int i = 1;
36
37        while (!q.isEmpty() && i < arr.length) {
38            TreeNode curr = q.poll();
39
40            if (!arr[i].equals("null")) {
41                curr.left = new TreeNode(Integer.parseInt(arr[i]));
42                q.add(curr.left);
43            }
44            i++;
45
46            if (i < arr.length && !arr[i].equals("null")) {
47                curr.right = new TreeNode(Integer.parseInt(arr[i]));
48                q.add(curr.right);
49            }
50            i++;
51        }
52
53        return root;
54    }
55}