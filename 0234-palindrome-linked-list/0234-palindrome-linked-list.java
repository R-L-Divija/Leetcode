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
    public ListNode rev(ListNode l){
        ListNode p=null;
        ListNode q=l;
        while(q!=null){
            ListNode t=q.next;
            q.next=p;
            p=q;
            q=t;
        }
        return p;
        
    }
    public boolean isPalindrome(ListNode head) {
        ListNode l=head;
        ListNode r=head;
        ListNode q=head;
        while(r!=null &&r.next!=null){
           l=l.next;
           r=r.next.next;
        }
        if(r!=null){
            l=l.next;
        }
      
       
        ListNode p=rev(l);
       
        while(p!=null){
            if(q.val!=p.val)return false;
            p=p.next;
            q=q.next;
        }
return true;
    }
}