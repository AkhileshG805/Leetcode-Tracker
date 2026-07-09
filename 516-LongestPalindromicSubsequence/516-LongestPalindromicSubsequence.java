// Last updated: 7/9/2026, 3:11:57 PM
import java.util.HashMap;

class Solution {

    HashMap<String, Integer> map = new HashMap<>();

    public int longestPalindromeSubseq(String s) {
        return recursive(s, 0, s.length() - 1);
    }

    public int recursive(String s, int l, int r) {

        if (l > r) return 0;

        if (l == r) return 1;

        String t = l + "," + r;

        if (map.containsKey(t)) {
            return map.get(t);
        }

        int ans;

        if (s.charAt(l) == s.charAt(r)) {

            ans = 2 + recursive(s, l + 1, r - 1);

        } else {

            ans = Math.max(
                    recursive(s, l + 1, r),
                    recursive(s, l, r - 1)
            );
        }

        map.put(t, ans);

        return ans;
    }
}