class Solution {
    public boolean check(int r, int c, char[][]board,char ch){
        //row check
        for(int i=0;i<9;i++){
            if(board[r][i]==ch)return false;
        }
        //col check
          for(int i=0;i<9;i++){
            if(board[i][c]==ch)return false;
        }
        //box check
        int fr=(r/3)*3;
        int fc=(c/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               int nr=fr+i,nc=fc+j;
               if(board[nr][nc]==ch)return false;
            }
        }
        return true;
    }
public boolean func(int r,int c,char[][] board){
    if(r==9)return true;
    if(c==9) return func(r+1,0,board);
    if(board[r][c]!='.')return func(r,c+1,board);
    for(char ch='1';ch<='9';ch++){
            if(check(r,c,board,ch)){
            board[r][c]=ch;
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