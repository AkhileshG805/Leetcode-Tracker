// Last updated: 7/9/2026, 3:13:49 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        method(ans, cur, n, k, 1);
        return ans;
    }
    void method(List<List<Integer>> ans,
                List<Integer> cur,
                int n,
                int k,
                int start) {
        if (cur.size() == k) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i <= n; i++) {
            cur.add(i);
            method(ans, cur, n, k, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}