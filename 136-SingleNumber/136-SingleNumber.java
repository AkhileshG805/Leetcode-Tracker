// Last updated: 7/9/2026, 3:13:23 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;
        
    }
}