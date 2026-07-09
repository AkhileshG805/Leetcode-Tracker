// Last updated: 7/9/2026, 3:13:14 PM
class Solution {
    public String convertToTitle(int n) {
        StringBuffer ans=new StringBuffer();
        while(n>0){
            n--;
            ans.append((char)((n%26)+'A'));
            n/=26;
        }
        return ans.reverse().toString();
        
        
    }
}