class Solution {
    public int findCircleNum(int[][] a) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
           if(a[i][j]==1){
            adj.get(i).add(j);
           adj.get(j).add(i);}
        }
        }
        int c=0;
        int v[]=new int[a.length];
        Arrays.fill(v,0);
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<a.length;i++){
            if(v[i]==0){
                c++;
            q.offer(i);
            v[i]=1;
            while(!q.isEmpty()){
                int val=q.poll();
                for(int x:adj.get(val)){
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