/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 struct ListNode * merge(struct ListNode *a,struct ListNode *b){
    if(!a)return b;
    if(!b)return a;
    if(a->val < b->val){
        a->next=merge(a->next,b);
        return a;
    }else{
        b->next=merge(a,b->next);
        return b;
    }
 }
 void split(struct ListNode *source,struct ListNode **front,struct ListNode **back){
    struct ListNode *slow=source;
    struct ListNode *fast=source->next;
    while(fast!=NULL&&fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }
    *front=source;
    *back=slow->next;
    slow->next=NULL;
 }
struct ListNode* sortList(struct ListNode* head) {
    if(!head||!head->next)return head;
    struct ListNode *left;
    struct ListNode *right;
    split(head,&left,&right);
    left=sortList(left);
    right=sortList(right);
    return merge(left,right);
}