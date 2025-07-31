/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 typedef struct ListNode* NODE;
struct ListNode* rotateRight(struct ListNode* head, int k) {
if(head==NULL||head->next==NULL||k==0)return head;
int l=1;
NODE q=head;
while(q->next){
    q=q->next;
    l++;  
}
q->next=head;
k=k%l;
int n=l-k;
NODE temp=head;
for(int i=1;i<n;i++){
    temp=temp->next;
}
NODE new=temp->next;
temp->next=NULL;
return new;

}