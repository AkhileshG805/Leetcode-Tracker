// Last updated: 9/4/2026, 2:39:46 PM
1class Solution {
2    public List<String> removeInvalidParentheses(String s) {
3    int rmL = 0, rmR = 0;
4    for (int i = 0; i < s.length(); i++) {
5        if (s.charAt(i) == '(') {
6            rmL++;
7        } else if (s.charAt(i) == ')') {
8            if (rmL != 0) {
9                rmL--;
10            } else {
11                rmR++;
12            }
13        }
14    }
15    Set<String> res = new HashSet<>();
16    dfs(s, 0, res, new StringBuilder(), rmL, rmR, 0);
17    return new ArrayList<String>(res);
18}
19
20public void dfs(String s, int i, Set<String> res, StringBuilder sb, int rmL, int rmR, int open) {
21    if (rmL < 0 || rmR < 0 || open < 0) {
22        return;
23    }
24    if (i == s.length()) {
25        if (rmL == 0 && rmR == 0 && open == 0) {
26            res.add(sb.toString());
27        }        
28        return;
29    }
30
31    char c = s.charAt(i); 
32    int len = sb.length();
33
34    if (c == '(') {
35        dfs(s, i + 1, res, sb, rmL - 1, rmR, open);		    // not use (
36    	dfs(s, i + 1, res, sb.append(c), rmL, rmR, open + 1);       // use (
37
38    } else if (c == ')') {
39        dfs(s, i + 1, res, sb, rmL, rmR - 1, open);	            // not use  )
40    	dfs(s, i + 1, res, sb.append(c), rmL, rmR, open - 1);  	    // use )
41
42    } else {
43        dfs(s, i + 1, res, sb.append(c), rmL, rmR, open);	
44    }
45
46    sb.setLength(len);        
47}
48}