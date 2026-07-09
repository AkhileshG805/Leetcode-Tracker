// Last updated: 7/9/2026, 3:13:25 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tc=0,g=0,ans=0;
        for(int i=0;i<gas.length;i++){
            tc+=gas[i]-cost[i];
            g+=gas[i]-cost[i];
            if(g<0){
                g=0;
                ans=i+1;
            }
        }
        return tc>=0?ans:-1;
        
    }
}