class Solution {
    public int findCircleNum(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                if(a[i][j]==1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int v[]=new int[n];
        Arrays.fill(v,0);
        Queue<Integer>q=new LinkedList<>();
    ;
       int c=0;
       for(int i=0;i<n;i++){
        if(v[i]==0){
        q.offer(i);
           v[i]=1;
            c++;
            while(!q.isEmpty()){
                int t=q.poll();
                for(int x:adj.get(t)){
                    if(v[x]==0){
                        q.offer(x);
                        v[x]=1;
                    }
                }
            }
        }
       }
       return c;
    }
}