// Last updated: 9/3/2026, 3:01:39 PM
1class Solution {
2    char[][] board;
3    int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
4    boolean[][] used;
5    int m;
6    int n;
7    public List<String> findWords(char[][] board, String[] words) {
8        this.board = board;
9        this.m = board.length;
10        this.n = board[0].length;
11        this.used = new boolean[m][n]; 
12        Trie root = new Trie();
13        for (String word : words) {
14            if (word.length() > m * n) continue;
15            root.addWord(word);
16        }
17        List<String> ans = new ArrayList<>();        
18        for (int i = 0; i < m; i++) {
19            for (int j = 0; j < n; j++) {
20                char c = board[i][j];
21                int idx = c - 'a';                
22                if (root.child[idx] != null) {
23                    used[i][j] = true; 
24                    backtrack(i, j, root.child[idx], ans, used);
25                    used[i][j] = false; 
26                }
27            }
28        }
29        return ans;
30    }
31    void backtrack(int row, int col, Trie trie, List<String> ans, boolean[][] used) {        
32        if (trie.isWord) {
33            trie.isWord = false; 
34            ans.add(trie.word);  
35        }        
36        for (int[] direction : directions) {
37            int nextRow = row + direction[0];
38            int nextCol = col + direction[1];
39            if (isValid(nextRow, nextCol) && !used[nextRow][nextCol]) {
40                char c = board[nextRow][nextCol];
41                int idx = c - 'a';                
42                if (trie.child[idx] != null) {
43                    used[nextRow][nextCol] = true; 
44                    backtrack(nextRow, nextCol, trie.child[idx], ans, used); 
45                    
46                    used[nextRow][nextCol] = false; 
47                }
48            }
49        }
50    }
51
52    boolean isValid(int row, int col) {
53        return row >= 0 && row < m && col >= 0 && col < n;
54    }
55
56    class Trie {
57        Trie[] child = new Trie[26];
58        boolean isWord = false;
59        String word = null; 
60        void addWord(String word) {
61            Trie curr = this;
62            for (char c : word.toCharArray()) {
63                int idx = c - 'a';
64                if (curr.child[idx] == null) {
65                    curr.child[idx] = new Trie();
66                }
67                curr = curr.child[idx];
68            }
69            curr.isWord = true;
70            curr.word = word; 
71        }
72    }
73}