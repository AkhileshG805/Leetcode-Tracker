// Last updated: 7/9/2026, 3:11:41 PM
class Solution {
    public int search(int[] nums, int target) {
        int present = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {

                present = i;
                break;
            }
        }
        return present;
    }
}