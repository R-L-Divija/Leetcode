/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode l=head;
        ListNode r=head;
        boolean sp=false;
        while(r!=null && r.next!=null){
            l=l.next;
            r=r.next.next;
            if(l==r){
                sp=true;
                break;
                }}
    if(!sp)return null;
       l=head;
        while(l!=r){
          l=l.next;
          r=r.next;
    }
    return l;
    }
}