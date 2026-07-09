// Last updated: 7/9/2026, 3:13:19 PM
class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode t = head; t != null; t = t.next)
            arr.add(t.val);
        ListNode t = head;
        int i = 0, j = arr.size() - 1;
        while(i < j){
            t.val = arr.get(i++);
            t = t.next;
            t.val = arr.get(j--);
            t = t.next;
        }
        if(i == j)
            t.val = arr.get(i);
    }
}

