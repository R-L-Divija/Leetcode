class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
     Arrays.sort(intervals, (a,b)->a[1]-b[1]);
     Stack<Integer>st=new Stack<>();
     int c=0;
     for(int i=0;i<intervals.length;i++){
        if(st.isEmpty()){
         st.push(intervals[i][1]);
        
        }else{
            int t=st.peek();
            if(t<=intervals[i][0]){
                 st.push(intervals[i][1]);
            }
              else c++;
        }
     }  
     return c; 
    }
}