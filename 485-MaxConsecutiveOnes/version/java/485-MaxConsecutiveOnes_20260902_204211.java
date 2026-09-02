// Last updated: 9/2/2026, 8:42:11 PM
1class Solution {
2    public boolean isidentical(TreeNode root, TreeNode subroot){
3        if(root==null && subroot==null){
4            return true;
5        } else if(root==null || subroot==null || root.val!=subroot.val){
6            return false;
7        }
8        if(!isidentical(root.left, subroot.left)){
9            return false;
10        }
11        if(!isidentical(root.right, subroot.right)){
12            return false;
13        }
14        return true;
15    }
16    public boolean subtree(TreeNode root, TreeNode subroot){
17        if(root==null){
18            return false;
19        }
20        if(root.val==subroot.val){
21            if(isidentical(root, subroot)){
22                return true;
23            }
24        }
25        return subtree(root.left, subroot) || subtree(root.right, subroot);
26    }
27    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
28        return subtree(root, subRoot);
29    }
30}