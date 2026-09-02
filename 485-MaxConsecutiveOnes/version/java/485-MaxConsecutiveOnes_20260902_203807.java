// Last updated: 9/2/2026, 8:38:07 PM
1class Solution {
2    public boolean checkRecord(String s) {
3        int absentCount = 0;
4        int lateCount = 0;
5        for (int i = 0; i < s.length(); i++) {
6            char ch = s.charAt(i);
7            if (ch == 'A') {
8                absentCount++;
9                if (absentCount >= 2) {
10                    return false;
11                }
12            }
13            if (ch == 'L') {
14                lateCount++;
15                if (lateCount >= 3) {
16                    return false;
17                }
18            } else {
19                lateCount = 0;
20            }
21        }
22        return true;
23    }
24}