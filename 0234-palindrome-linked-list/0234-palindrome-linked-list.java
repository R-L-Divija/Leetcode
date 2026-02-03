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
    public ListNode rev(ListNode head){
        ListNode temp=head;
        ListNode p=null;
        while(temp!=null){
ListNode q=temp.next;
temp.next=p;
p=temp;
temp=q;
        }
        return p;
    }
    public ListNode copy(ListNode head){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while(head != null){
            cur.next = new ListNode(head.val);
            cur = cur.next;
            head = head.next;
        }
        return dummy.next;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ListNode copy=copy(head);
        ListNode h1=rev(copy);
        while(h1!=null || temp!=null){
      
            if(h1.val!=temp.val)return false;
            h1=h1.next;
            temp=temp.next;
        }
        return true;
    }
}