// Last updated: 7/9/2026, 3:10:49 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int h:hours){
            if(h>=target){
                count++;
            }
        }
        return count;
        
    }
}