// Last updated: 7/9/2026, 3:10:41 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int result=0;
        for(int x:nums){
            if(x%3!=0){
                result++;
            }
        }
        return result;
    }
}