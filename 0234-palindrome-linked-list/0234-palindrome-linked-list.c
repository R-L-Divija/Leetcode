/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
typedef struct ListNode* NODE;
NODE revers(NODE head){
    NODE temp=head;
    NODE p=0;
    NODE q=head;
    while(q){
        q=q->next;
        temp->next=p;
        p=temp;
        temp=q;
    }
head=p;
return p;
}
bool isPalindrome(struct ListNode* head) {
    NODE fast=head;
    NODE slow=head;
    while(fast!=NULL &&fast->next!=NULL){
        fast=fast->next->next;//move to two places ahead;
        slow=slow->next;//move to one place ahead;
    }
    slow=revers(slow);
    fast=head;
    while(slow){
        if(fast->val!=slow->val) return false;
        fast=fast->next;
        slow=slow->next;
    }
    return true;
}
