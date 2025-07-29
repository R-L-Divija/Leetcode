/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 typedef struct ListNode* NODE;
struct ListNode* deleteDuplicates(struct ListNode* head) {
    NODE temp=head;
    while(temp!=NULL&&temp->next!=NULL){
        if(temp->val==temp->next->val){
            NODE dup=temp->next;
           temp->next=temp->next->next;
         free(dup);
        }else{
        temp=temp->next;
        }
    }
    return head;
}