class Solution {
    StringBuilder t;
    boolean v[][];
    int dir[][]={{1,0},{0,-1},{0,1},{-1,0}};
    public boolean func(int r,int c,int index,char board[][],String word){
         int n=board.length;
         int m=board[0].length;
        if(index==word.length())return true;
        if(r<0||r>n-1||c<0||c>m-1||board[r][c]!=word.charAt(index)||v[r][c])return false;
        v[r][c]=true;
         for(int i=0;i<4;i++){
          int nr=r+dir[i][0];
          int ne=c+dir[i][1];
          if(func(nr, ne,index+1,board,word))return true;
         }
         v[r][c]=false;
         return false;

         
    }
    public boolean exist(char[][] board, String word) {
        t=new StringBuilder();
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