// Last updated: 7/9/2026, 3:12:25 PM
class Solution {
    public int missingNumber(int[] nums) {
        int count=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                count=i;
                break;
            } 
        }
        return count;
        
    }
}