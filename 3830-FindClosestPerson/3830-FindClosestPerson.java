// Last updated: 7/9/2026, 3:10:30 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int a=Math.abs(x-z);
        int b=Math.abs(y-z);
        if(a<b) return 1;
        if(a>b) return  2;
        return 0;
        
    }
}