// Last updated: 7/9/2026, 3:13:11 PM
class Solution {
    public int titleToNumber(String s) {
        int a=0;
        for(int i=0;i<s.length();i++){
            a=a*26+s.charAt(i)-64;
        }
        return a;
        
    }
}