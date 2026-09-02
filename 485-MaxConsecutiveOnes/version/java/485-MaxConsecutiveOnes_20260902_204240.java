// Last updated: 9/2/2026, 8:42:40 PM
1class Solution {
2    public int distributeCandies(int[] candyType) 
3    {
4     int n = candyType.length;
5     int mini = Integer.MIN_VALUE;
6     HashSet<Integer> set = new HashSet<>();
7     for(int num : candyType)
8     {
9        set.add(num);
10     }  
11     int uniqueType = set.size();
12     mini = Math.min(uniqueType, n/2);
13    return mini; 
14    }
15}