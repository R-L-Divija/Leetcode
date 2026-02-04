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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode node:lists){
if(node!=null)pq.add(node);
        }
     if(pq.isEmpty())return null;
    ListNode temp=pq.poll();
    ListNode p=temp;
    if(temp.next!=null){
        pq.add(temp.next);
    }
    while(!pq.isEmpty()){
        ListNode q=pq.poll();
        p.next=q;
        p=p.next;
        if(q.next!=null){
            pq.add(q.next);
        }
    }
    return temp;
    }
}