// Last updated: 10/12/2026, 10:30:06 PM
1class Solution {
2    public int[] lexicographicallySmallestArray(int[] A, int limit) {
3        int[] srt = A.clone();
4        Arrays.sort(srt);
5        List<List<Integer>> grps = new ArrayList<>();
6        Map<Integer, Integer> map = new HashMap<>();
7        int id = -1;
8
9        for (int i = 0; i < srt.length; i++) {
10            if (i == 0 || srt[i] - srt[i - 1] > limit) {
11                grps.add(new ArrayList<>());
12                id++;
13            }
14            
15            grps.get(id).add(srt[i]);
16            map.put(srt[i], id);
17        }
18
19        int[] idx = new int[grps.size()];
20
21        for (int i = 0; i < A.length; i++) {
22            int cur = map.get(A[i]);
23            A[i] = grps.get(cur).get(idx[cur]);
24            idx[cur]++;
25        }
26
27        return A;
28    }
29}