// Last updated: 7/9/2026, 3:11:21 PM
class Solution {
    public int numberOfSteps(int num) {

        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0)
                num /= 2;
            else
                num--;

            steps++;
        }

        return steps;
    }
}