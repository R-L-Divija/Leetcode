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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null &&n==1){
            return head.next;
        }
        ListNode temp=head;
        int len=0;
        while(temp!=null){
           len++;
           temp=temp.next;
        }
        int pos=len-n+1;
        int i=1;
        if(pos==1){
            head=head.next;
            return head;
        }
        ListNode q=head;
        ListNode p=head;
        while(i<pos && q!=null){
            i++;
            p=q;
            q=q.next;
        }
        p.next=q.next;
        q=null;
        return head;
    }
}