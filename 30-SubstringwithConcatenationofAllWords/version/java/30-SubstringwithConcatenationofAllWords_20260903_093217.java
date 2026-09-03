// Last updated: 9/3/2026, 9:32:17 AM
1class Solution {
2    Map<String, Boolean> mp = new HashMap<>();
3    public boolean isScramble(String s1, String s2) {
4        int n = s1.length();
5        if (s2.length() != n)
6            return false;
7        if (s1.equals(s2))
8            return true;
9        if (n == 1)
10            return false;
11        String key = s1 + " " + s2;
12        if (mp.containsKey(key))
13            return mp.get(key);
14        for (int i = 1; i < n; i++) {
15            boolean withoutswap = (
16                    isScramble(s1.substring(0, i), s2.substring(0, i))
17                            &&
18                            isScramble(s1.substring(i), s2.substring(i))
19            );
20            if (withoutswap) {
21                mp.put(key, true);
22                return true;
23            }
24            boolean withswap = (
25                    isScramble(s1.substring(0, i), s2.substring(n - i))
26                            &&
27                            isScramble(s1.substring(i), s2.substring(0, n - i))
28            );
29            if (withswap) {
30                mp.put(key, true);
31                return true;
32            }
33        }
34        mp.put(key, false);
35        return false;
36    }
37}