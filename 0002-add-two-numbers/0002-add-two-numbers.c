/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 struct ListNode* create(int data){
    struct ListNode* temp=(struct ListNode*)malloc(sizeof(struct ListNode));
    temp->val=data;
    temp->next=NULL;
    return temp;
 }
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {

    struct ListNode* head=NULL;
    struct ListNode* q=NULL;
    int s=0;
    while(l1||l2||s){
    int s1=s;
    if(l1){
    s1+=l1->val;
    l1=l1->next;
   }
   if(l2){
    s1+=l2->val;
    l2=l2->next;
   }
  s=s1/10;
    struct ListNode* temp=create(s1%10);
    if(!head){
        head=q=temp;
    }else{
        q->next=temp;
        q=q->next;
    }
    }
    return head;

}

