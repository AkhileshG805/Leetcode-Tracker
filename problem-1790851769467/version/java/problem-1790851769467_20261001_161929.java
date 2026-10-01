// Last updated: 10/1/2026, 4:19:29 PM
1public class Solution {
2    Map<Integer, Boolean> map;
3    boolean[] used;
4    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
5        int sum = (1+maxChoosableInteger)*maxChoosableInteger/2;
6        if(sum < desiredTotal) return false;
7        if(desiredTotal <= 0) return true;
8        
9        map = new HashMap();
10        used = new boolean[maxChoosableInteger+1];
11        return helper(desiredTotal);
12    }
13    
14    public boolean helper(int desiredTotal){
15        if(desiredTotal <= 0) return false;
16        int key = format(used);
17        if(!map.containsKey(key)){
18    // try every unchosen number as next step
19            for(int i=1; i<used.length; i++){
20                if(!used[i]){
21                    used[i] = true;
22     // check whether this lead to a win (i.e. the other player lose)
23                    if(!helper(desiredTotal-i)){
24                        map.put(key, true);
25                        used[i] = false;
26                        return true;
27                    }
28                    used[i] = false;
29                }
30            }
31            map.put(key, false);
32        }
33        return map.get(key);
34    }
35   
36// transfer boolean[] to an Integer 
37    public int format(boolean[] used){
38        int num = 0;
39        for(boolean b: used){
40            num <<= 1;
41            if(b) num |= 1;
42        }
43        return num;
44    }
45}