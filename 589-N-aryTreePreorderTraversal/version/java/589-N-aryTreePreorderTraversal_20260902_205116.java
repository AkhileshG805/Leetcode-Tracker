// Last updated: 9/2/2026, 8:51:16 PM
1class Solution {
2    public List<Integer> preorder(Node root) {
3        List<Integer> ans = new ArrayList<>();
4        helper(root, ans);
5        return ans;
6    }
7    private void helper(Node root, List<Integer> ans){
8        if(root == null) return;
9
10        ans.add(root.val);
11
12        for(Node child : root.children){
13            helper(child, ans);
14        }
15    }
16}
17