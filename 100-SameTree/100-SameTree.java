// Last updated: 7/9/2026, 3:13:40 PM
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val!=q.val) return false;
        else return isSameTree(p.right,q.right)&&isSameTree(q.left,p.left);
    }
}