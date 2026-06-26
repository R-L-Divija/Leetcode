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
    public ListNode oddEvenList(ListNode head) {
        if(head==null ||head.next==null)return head;
        ListNode no=head;
        ListNode ne=head.next;
        ListNode temp=ne;
        while(ne!=null &&ne.next!=null){
           no.next=ne.next;
           no=no.next;
          ne.next=no.next;
          ne=ne.next;
        }
        no.next=temp;
        return head;
    }
}