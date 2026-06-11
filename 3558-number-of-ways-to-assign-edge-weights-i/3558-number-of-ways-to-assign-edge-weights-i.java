class Solution {
    static final long MOD=1_000_000_007L;
    public int func1(ArrayList<Integer>[]adj,int n){
        
        boolean v[]=new boolean[n+1];
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        int d=-1;
        v[1]=true;
        while(!q.isEmpty()){
            int s=q.size();
            while(s-->0){
             int t=q.poll();
             for(int x:adj[t]){
                if(!v[x]){
                    v[x]=true;
                    q.add(x);
                }
             }
            }
            d++;
        }
        return d;
        
    }
    public long func2(long a,long b){
   long r=1;
   while(b>0){
    if((b&1)==1){
        r=(r*a)%MOD;
    }
    a=(a*a)%MOD;
    b>>=1;
   }
   return r;
    }
    public int assignEdgeWeights(int[][] edges) {
        int n=edges.length+1;
        ArrayList<Integer>adj[]=new ArrayList[n+1];
        for(int i=1;i<=n;i++){
          adj[i]=new ArrayList<>();
        }
        for(int e[]:edges){
        adj[e[0]].add(e[1]);
        adj[e[1]].add(e[0]);
        }
        
        int d=func1(adj,n);
        if(d==0)return 1;
        return (int) func2(2,d-1);
    }
}