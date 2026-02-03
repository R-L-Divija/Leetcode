/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
      ListNode l=head;
      ListNode r=head;
      ListNode p=head;
      if(head.next==null)return null;
      while(r.next!=null){
        p=l;
        l=l.next;
        if(r.next.next==null){r=r.next;}
        else{
            r=r.next.next;
        }
      } 
      p.next=l.next;
      return head; 
    }
}