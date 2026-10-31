class Solution {
    public int numIslands(char[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        if(grid==null||m==0)return 0;
        int c=0;
        int [][]dir={{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    c++;
                    q.add(new int[]{i,j});
                    grid[i][j]='0';

                    while(!q.isEmpty()){
                        int t[]=q.poll();
                        int x=t[0];
                        int y=t[1];

                        for(int d[]:dir){
                            int nr=x+d[0];
                            int nc=y+d[1];

                            if(nr<0||nr>=m||nc<0||nc>=n)continue;
                                if(grid[nr][nc]=='1'){
                                    q.add(new int[]{nr,nc});
                                    grid[nr][nc]='0';
                                }
                            
                        }
                    }
                }
                
            }
        }
        return c;
    }
}