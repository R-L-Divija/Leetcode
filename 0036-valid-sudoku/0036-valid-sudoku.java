class Solution {
    public boolean func(int r,int c,char[][] b){
        //check rows ooda columns;
        for(int i=0;i<9;i++){
            if(i==c)continue;
            if(b[r][i]==b[r][c])return false;
     
    }
    //check columns ooda rows
         for(int i=0;i<9;i++){
            if(i==r)continue;
            if(b[i][c]==b[r][c])return false;
        }
        //box check;
        int fr=(r/3)*3;
        int fc=(c/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int nr=fr+i,nc=fc+j;
                if(nr==r &&nc==c)continue;
                else{
                    if(b[nr][nc]==b[r][c])return false;
                }
            }
        }
        return true;
}
    
    public boolean isValidSudoku(char[][] board) {
  boolean ans=true;;
       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
        if(board[i][j]=='.')continue;
        else{
            if(func(i,j,board)==false)return false;
            
        }
        }
       }
       return true;
    }
}