class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(k==0 )return matrix[0][0];
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int x[]:matrix){
            for(int y:x){
            pq.add(y);
            }
        }
        int x=0;
        while(k>0 && !pq.isEmpty()){
            x=pq.poll();
            k--;
        }
      
       return x;
        
    }
}