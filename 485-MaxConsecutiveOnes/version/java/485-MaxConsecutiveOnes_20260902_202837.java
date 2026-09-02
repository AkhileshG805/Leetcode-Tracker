// Last updated: 9/2/2026, 8:28:37 PM
1class Solution {
2    int count = 0;
3    int maxCount = 0;
4    Integer prev = null;
5    public int[] findMode(TreeNode root) {
6        List<Integer> ans = new ArrayList<>();
7        helper(root, ans);
8        int[] mode = new int[ans.size()];
9        for(int i = 0; i < ans.size(); i++){
10            mode[i] = ans.get(i);
11        }
12        return mode;
13    }
14    private void helper(TreeNode root, List<Integer> ans){
15        if(root == null) return;
16        helper(root.left, ans);
17        if(prev != null && root.val == prev){
18            count++;
19        }
20        else {
21            count = 1;
22        }
23        if(count >= maxCount){
24            if(count == maxCount){
25                ans.add(root.val);
26            }
27            else {
28                ans.clear();
29                ans.add(root.val);
30                maxCount = count;
31            }
32        }
33        prev = root.val;
34        helper(root.right, ans);
35    }
36}