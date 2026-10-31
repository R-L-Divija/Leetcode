class Solution {
    public int orangesRotting(int[][] grid) {
        int [][]dir={{1,0},{-1,0},{0,1},{0,-1}};
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        int f=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)q.add(new int[]{i,j});
                if(grid[i][j]==1)f++;
            }
        }
        int min=0;
        while(!q.isEmpty() &&f>0){
            int s=q.size();
            while(s-->0){
                int t[]=q.poll();
                int x=t[0];
                int y=t[1];

                for(int d[]:dir){
                    int nr=x+d[0];
                    int nc=y+d[1];
                    if(nc<0||nc>=n||nr<0||nr>=m)continue;
                    if(grid[nr][nc]==1){
                        f--;
                        grid[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            min++;
        }
     if(f==0)return min;
     return -1;
    }
}