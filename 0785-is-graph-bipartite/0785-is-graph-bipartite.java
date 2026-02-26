class Solution {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;
        int v[] = new int[n];

        for(int i=0;i<n;i++){

            if(v[i] != 0) continue;

            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{i,1});
            v[i] = 1;

            while(!q.isEmpty()){

                int[] t = q.poll();
                int node = t[0];
                int col = t[1];

                for(int nei : graph[node]){

                    if(v[nei] == 0){
                        v[nei] = -col;
                        q.offer(new int[]{nei,-col});
                    }
                    else if(v[nei] == col){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}