// Last updated: 7/9/2026, 3:11:03 PM
class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        for(int x:nums){
             if(x%6==0){
            sum+=x;
            count++;
            }
        }
        return count==0?0:sum/count;
    }
}