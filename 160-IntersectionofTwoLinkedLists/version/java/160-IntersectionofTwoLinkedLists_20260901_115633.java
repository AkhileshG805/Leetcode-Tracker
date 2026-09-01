// Last updated: 9/1/2026, 11:56:33 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14    //boundary check
15    if(headA == null || headB == null) return null;
16    
17    ListNode a = headA;
18    ListNode b = headB;
19    
20    //if a & b have different len, then we will stop the loop after second iteration
21    while( a != b){
22    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
23        a = a == null? headB : a.next;
24        b = b == null? headA : b.next;    
25    }
26    
27    return a;
28}
29}