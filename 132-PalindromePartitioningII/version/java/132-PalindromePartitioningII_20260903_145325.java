// Last updated: 9/3/2026, 2:53:25 PM
1class Solution {
2    class TrieNode{
3        TrieNode[]children;
4        boolean eow;
5        public TrieNode(){
6            children=new TrieNode[26];
7            eow=false;
8        }
9    }
10    Map<Integer,List<String>> memo=new HashMap<>();
11     TrieNode root=new TrieNode();
12    
13    public List<String> wordBreak(String s, List<String> wordDict) {
14        for(String str:wordDict){
15            TrieNode  curr=root;
16            for(int i=0; i<str.length(); i++){
17                int idx=str.charAt(i)-'a';
18                if(curr.children[idx]==null){
19                    curr.children[idx]=new TrieNode();
20                }
21                curr=curr.children[idx];
22            }
23            curr.eow=true;
24        }
25        return dfs(0,s);
26    }
27    public List<String> dfs(int start,String s){
28        if(start==s.length()){
29            List<String> baseRes=new ArrayList<>();
30            baseRes.add("");
31            return baseRes;
32        }
33        if(memo.containsKey(start)){
34            return memo.get(start);
35        }
36        List<String> validSentences=new ArrayList<>();
37        TrieNode curr=root;
38        for(int i=start; i<s.length(); i++){
39            int idx=s.charAt(i)-'a';
40            if(curr.children[idx]==null) break;
41            curr=curr.children[idx];
42            if(curr.eow){
43            String currStr=s.substring(start,i+1);
44            List<String> subSentences=dfs(i+1,s);
45            for(String sub:subSentences){
46                if(sub.isEmpty()){
47                    validSentences.add(currStr);
48                }else{
49                    validSentences.add(currStr+" "+sub);
50                }
51            }
52        }
53        }
54        
55        memo.put(start,validSentences);
56        return validSentences;
57    }
58}