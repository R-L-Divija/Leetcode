class Solution {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) { 
        int d[]=new int[n];
        Arrays.fill(d,Integer.MAX_VALUE);
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<flights.length;i++){
            int x=flights[i][0];
            int y=flights[i][1];
            int wt=flights[i][2];
            adj.get(x).add(new int[]{y,wt});
        }
        Queue<int[]>pq=new LinkedList<>();
        pq.offer(new int[]{0,0,src});
        while(!pq.isEmpty()){
        int []t=pq.poll();
        int dis=t[0];
        int st=t[1];
        int node=t[2];
        if(st>k)continue;
        
        for(int x[]:adj.get(node)){
            int val=x[0];
            int dis1=x[1];
            if(dis+dis1<d[val] &&st<=k){
                d[val]=dis+dis1;
                pq.offer(new int[]{d[val],st+1,val});
            }
        }
        }
        if(d[dst]==Integer.MAX_VALUE)return -1;
        return d[dst];
    }
}