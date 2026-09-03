// Last updated: 9/3/2026, 3:03:18 PM
1class TopNode {
2    int x;
3    int h;
4    TopNode next;
5    TopNode() {
6    }
7    TopNode(int x, int h) {
8        this.x = x;
9        this.h = h;
10    }
11
12    void insert(TopNode n) {
13        n.next = next;
14        next = n;
15    }
16
17}
18class Solution {
19    static final int LEFT=0, RIGHT=1, HEIGHT=2;
20    public List<List<Integer>> getSkyline(int[][] buildings) {
21        TopNode head = new TopNode(0,0);
22        head.insert(new TopNode(Integer.MAX_VALUE, 0));
23        TopNode start = head;
24        
25        for (int i = 0; i<buildings.length; i++) {
26            int[] b = buildings[i];
27            int bL = buildings[i][LEFT];
28            int bR = buildings[i][RIGHT];
29            int bH = buildings[i][HEIGHT];
30            while (bL >= start.next.x) { start = start.next; } 
31            for (TopNode t = start ; bR > t.x; t = t.next) {
32                if (bH <= t.h) {
33                    continue;
34                }
35
36                TopNode stop = t;
37                while (stop.next != null && stop.next.x < bR && stop.next.h <= bH ) {
38                    stop = stop.next;
39                }
40                
41                if (bL <= t.x) {
42                    if (bR >= stop.next.x) {
43                        t.next = stop.next;
44                        t.h = bH;
45                    }
46                    else if (t == stop) {
47                        t.insert(new TopNode(bR,t.h));
48                        t.h = bH;
49                        break;
50                    }
51                    else {
52                        stop.x = bR;
53                        t.h = bH;
54                        t.next = stop;
55                        break;
56                    }
57                }
58                else {
59                    if (bR >= stop.next.x) {
60                        if (t == stop) {
61                            t.insert(new TopNode(bL, bH));
62                        }
63                        else {
64                            t.next = stop;
65                            stop.x = bL;
66                            stop.h = bH;
67                        }
68                        break;
69                    }
70                    else if (t == stop) {
71                        t.insert(new TopNode(bL,bH));
72                        t.next.insert(new TopNode(bR,t.h));
73                        break;
74                    }
75                    else {
76                        t.next = stop;
77                        t.insert(new TopNode(bL,bH));
78                        stop.x = bR;
79                        break;
80                    }
81                }
82                t = stop;
83
84            }
85        }
86
87        List<List<Integer>> skyline = new ArrayList<>();
88
89        if (head.h == 0)
90            head = head.next;
91        while (head != null) {
92            int height = head.h;
93            skyline.add(List.of(head.x, height));
94            while ( (head = head.next) != null && head.h == height) {}
95        }
96
97        return skyline;
98    }
99
100}