// Last updated: 7/9/2026, 3:14:45 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j])
                return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}