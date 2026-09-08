// Last updated: 9/8/2026, 10:08:16 AM
1class Solution {
2
3    Map<String , PriorityQueue<String>> graph=new HashMap<>();
4    List<String> ans=new ArrayList<>();
5
6    public List<String> findItinerary(List<List<String>> tickets) {
7
8        for(List<String> t : tickets)
9        {
10            String from=t.get(0);
11            String to=t.get(1);
12
13            graph.putIfAbsent(from , new PriorityQueue<>());
14            graph.get(from).add(to);
15        }
16
17        dfs("JFK");
18
19        Collections.reverse(ans);
20        return ans;
21    }
22
23    void dfs(String curr)
24    {
25        PriorityQueue<String> pq=graph.get(curr);
26
27        while( pq != null && !pq.isEmpty())
28        {
29            String nextdest=pq.poll();
30            dfs(nextdest);
31        }
32        ans.add(curr);
33    }
34}