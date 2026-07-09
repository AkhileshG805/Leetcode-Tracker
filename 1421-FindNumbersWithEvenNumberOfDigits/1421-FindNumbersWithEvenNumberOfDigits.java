// Last updated: 7/9/2026, 3:11:23 PM
class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {
            int digits = String.valueOf(num).length();

            if (digits % 2 == 0)
                count++;
        }

        return count;
    }
}