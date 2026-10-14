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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0);
        ListNode tail=temp;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                tail.next=l1;
                l1=l1.next;
            }
            else if(l1.val>l2.val){
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        while(l1!=null){
            tail.next=l1;
            tail=tail.next;
                l1=l1.next;
        }
        while(l2!=null){
            tail.next=l2;
            tail=tail.next;
                l2=l2.next;
        }
        return temp.next;
    }
}