class Solution {
    public int largestRectangleArea(int[] arr) {
        //prev smaller
      Stack<Integer>prev=new Stack<>();
      ArrayList<Integer>res1=new ArrayList<>();
      for(int i=0;i<arr.length;i++){
        while(!prev.isEmpty()&& arr[prev.peek()]>=arr[i])prev.pop();
        if(prev.isEmpty())res1.add(-1);
        else res1.add(prev.peek());
        prev.push(i);
      }  
      //next smaller
            Stack<Integer>next=new Stack<>();
      ArrayList<Integer>res2=new ArrayList<>();
      for(int i=arr.length-1;i>=0;i--){
        while(!next.isEmpty()&& arr[next.peek()]>=arr[i])next.pop();
        if(next.isEmpty())res2.add(arr.length);
        else res2.add(next.peek());
        next.push(i);
      }  
      Collections.reverse(res2);
      //calculate
      int ans=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        int w=res2.get(i)-res1.get(i)-1;
        int a=w*arr[i];
        ans=Math.max(ans,a);
      }
      return ans;
    }
}