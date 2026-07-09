// Last updated: 7/9/2026, 3:12:17 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<t.length();i++){
            sum+=t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            sum-=s.charAt(i);
        }
        return (char)sum;
        
    }
}