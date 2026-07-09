// Last updated: 7/9/2026, 3:11:47 PM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<>();

        for (int num = left; num <= right; num++) {

            int temp = num;
            boolean valid = true;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit == 0 || num % digit != 0) {
                    valid = false;
                    break;
                }

                temp /= 10;
            }

            if (valid)
                ans.add(num);
        }

        return ans;
    }
}