// Last updated: 8/23/2026, 8:47:55 AM
1class Solution {
2    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
3        boolean[] a=new boolean[upper+1];
4        for(int i=0;i<nums.length;i++){
5            int b=nums[i];
6            if(b>=lower && b<=upper){
7                a[b]=true;
8            }
9        }
10        List<List<Integer>> c=new ArrayList<>();
11        int d=lower;
12        while(d<=upper){
13            if(!a[d]){
14                int e=d;
15                while(d<=upper && !a[d]){
16                    d++;
17                }
18                int f=d-1;
19                List<Integer> g =new ArrayList<>();
20                g.add(e);
21                g.add(f);
22                c.add(g);
23            }else{
24                d++;
25            }
26        }
27        return c;
28    }
29}