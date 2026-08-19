class Solution {
    public boolean check(int r,int c,char c1,char[][]b){
        for(int i=0;i<9;i++){
            if(b[i][c]==c1)
            return false;
        }
        for(int i=0;i<9;i++){
            if(b[r][i]==c1)
            return false;
        }
        int fr=(r/3)*3;
        int fc=(c/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               int nr=fr+i;
               int nc=fc+j;
               if(b[nr][nc]==c1)
               return false;
            }
        }
           return true;
    }
    public boolean func(int r,int c,char[][] board){
            if(r==9) return true;
            if(c==9) return func(r+1,0,board);
            if(board[r][c]!='.')return func(r,c+1,board);
             for(char i='1';i<='9';i++){
                if(check(r,c,i,board)){
                    board[r][c]=i;
                    if(func(r,c+1,board))return true;
                    board[r][c]='.';
                }
             }
             return false;
    }
    public void solveSudoku(char[][] board) {
        func(0,0,board);
    }
}