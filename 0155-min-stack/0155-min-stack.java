class MinStack {
class Node{
    int data;
    int min;
    Node next;
    Node(int d,int m){
        data=d;
        min=m;
        next=null;
    }
}
Node top1;
    public MinStack() {
        top1=null;
    }
    
    public void push(int val) {
        if(top1==null){
        top1=new Node(val,val);
        }
        else{
        int min2=Math.min(top1.min,val);
        Node temp=new Node(val,min2);
        temp.next=top1;
        top1=temp;
        }
    }
    
    public void pop() {
        if(top1!=null){
            top1=top1.next;
        }
    }
    
    public int top() {
          if(top1!=null){
            return top1.data;
        }
        return 0;
    }
    
    public int getMin() {
       return top1.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */