class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<a.length;i++){
            boolean des=false;
            if(a[i]>0)st.push(a[i]);
            else{
                int c=Math.abs(a[i]);
                while(!st.isEmpty()&& st.peek()>0){
                    if(st.peek()<c)st.pop();
                    else if(st.peek()==c){
st.pop();
des=true;
break;
                    }else{
                        des=true;
                        break;
                    }
                }
                if(!des)st.push(a[i]);
            }
        }
            int[] arr=new int[st.size()];
            int m=st.size()-1;
            while(!st.isEmpty()){
                arr[m--]=st.pop();
            }

        return arr;
    }
}