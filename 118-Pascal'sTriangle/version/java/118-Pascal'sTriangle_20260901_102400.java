// Last updated: 9/1/2026, 10:24:00 AM
1class Solution {
2    public List<Integer> getRow(int r) {
3        List<Integer> ans = new ArrayList<>();
4        ans.add(1);
5        long temp = 1;
6        for(int i=1,up=r,down=1;i<=r;i++,up--, down++){
7            temp=temp*up/down;
8            ans.add((int)temp);
9        }
10        return ans;
11    }
12}