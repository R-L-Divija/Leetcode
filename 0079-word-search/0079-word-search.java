class Solution {
    public int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
    public boolean v[][];
    public boolean func(int r,int c,int index,char b[][],String w){
         int n=b.length;
        int m=b[0].length;
        if(index==w.length()){
            return true;
        }
        if(r<0||r>n-1||c<0||c>m-1|| (b[r][c]!=w.charAt(index))||v[r][c])return false;
        v[r][c]=true;
        for(int i=0;i<4;i++){
          int nr=r+dir[i][0];
          int nc=c+dir[i][1];
          if(func(nr,nc,index+1,b,w))return true;
        }
        v[r][c]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        v=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(func(i,j,0,board,word))return true;
            }
        }
        return false;
    }
}