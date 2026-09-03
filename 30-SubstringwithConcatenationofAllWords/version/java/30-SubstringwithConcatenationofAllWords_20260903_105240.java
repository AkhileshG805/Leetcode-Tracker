// Last updated: 9/3/2026, 10:52:40 AM
1import java.util.*;
2
3class Solution {
4    String b;
5    Map<String,Integer> mpp = new HashMap<>();
6    List<List<String>> ans = new ArrayList<>();
7
8    private void dfs(String word, List<String> seq) {
9        if (word.equals(b)) {
10            List<String> temp = new ArrayList<>(seq);
11            Collections.reverse(temp);
12            ans.add(temp);
13            return;
14        }
15        int steps = mpp.get(word);
16        char[] arr = word.toCharArray();
17        for (int i = 0; i < arr.length; i++) {
18            char org = arr[i];
19            for (char ch = 'a'; ch <= 'z'; ch++) {
20                arr[i] = ch;
21                String nxt = new String(arr);
22                if (mpp.containsKey(nxt) && mpp.get(nxt) + 1 == steps) {
23                    seq.add(nxt);
24                    dfs(nxt, seq);
25                    seq.remove(seq.size() - 1);
26                }
27            }
28            arr[i] = org;
29        }
30    }
31
32    public List<List<String>> findLadders(String st, String tar, List<String> wordList) {
33        Set<String> s = new HashSet<>(wordList);
34        if (st.equals(tar)) {
35            List<List<String>> res = new ArrayList<>();
36            res.add(Arrays.asList(st));
37            return res;
38        }
39        if (!s.contains(tar)) return new ArrayList<>();
40
41        Queue<String> q = new LinkedList<>();
42        q.add(st);
43        mpp.put(st, 1);
44        b = st;
45        boolean found = false;
46
47        while (!q.isEmpty() && !found) {
48            int sz = q.size();
49            for (int k = 0; k < sz; k++) {
50                String cur = q.poll();
51                int steps = mpp.get(cur);
52                char[] arr = cur.toCharArray();
53                for (int i = 0; i < arr.length; i++) {
54                    char org = arr[i];
55                    for (char ch = 'a'; ch <= 'z'; ch++) {
56                        arr[i] = ch;
57                        String nxt = new String(arr);
58                        if (s.contains(nxt) && !mpp.containsKey(nxt)) {
59                            mpp.put(nxt, steps + 1);
60                            if (nxt.equals(tar)) found = true;
61                            q.add(nxt);
62                        }
63                    }
64                    arr[i] = org;
65                }
66            }
67        }
68
69        if (mpp.containsKey(tar)) {
70            List<String> seq = new ArrayList<>();
71            seq.add(tar);
72            dfs(tar, seq);
73        }
74        return ans;
75    }
76}