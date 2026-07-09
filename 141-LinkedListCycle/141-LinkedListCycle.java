// Last updated: 7/9/2026, 3:13:22 PM
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        while(a!=null && a.next!=null){
            a=a.next.next;
            b=b.next;
            if(a==b){
                return true;
            }
        }
        return false;
    }
}