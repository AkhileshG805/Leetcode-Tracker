// Last updated: 9/1/2026, 10:51:24 PM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        List<String> list = new ArrayList<>();
4        int len = nums.length;
5        for(int i=0;i<len;i++){
6            int start = nums[i];
7            while(i+1 < len && nums[i+1]== nums[i]+1){
8                i++;
9            }
10            if(start==nums[i]){
11                list.add(String.valueOf(start));
12            }else{
13                list.add(start +"->"+nums[i]);
14            }
15        }
16        return list;
17    }
18}