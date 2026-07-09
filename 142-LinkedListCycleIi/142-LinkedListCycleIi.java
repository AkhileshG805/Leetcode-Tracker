// Last updated: 7/9/2026, 3:13:20 PM
class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        while(b!= null && b.next != null) {
            a = a.next;
            b = b.next.next;
            if(a==b) {
                a = head;
                while(a !=b) {
                    a=a.next;
                    b=b.next;
                }
                return a;
            }
        }
        return null;
    }
}