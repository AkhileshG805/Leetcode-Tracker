// Last updated: 7/9/2026, 3:13:26 PM
class Solution {
    HashMap<Node, Node> a = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (a.containsKey(node)) return a.get(node);
        Node copy = new Node(node.val);
        a.put(node, copy);
        for (Node b : node.neighbors) {
            copy.neighbors.add(cloneGraph(b));
        }
        return copy;
    }
}