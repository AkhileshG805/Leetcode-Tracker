// Last updated: 7/9/2026, 3:13:09 PM
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>=5){
            count+=n/5;
            n/=5;
        }
        return count;

        
    }
}