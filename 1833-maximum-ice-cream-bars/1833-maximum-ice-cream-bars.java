class Solution {
    public int maxIceCream(int[] costs, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int x:costs){
            pq.offer(x);
        }
        int s=0;
        int c=0;
        while(!pq.isEmpty()&& s<=k){
            if(s+pq.peek()<=k){
                s+=pq.poll();
                c++;
            }else break;
        }
        return c;
    }
}