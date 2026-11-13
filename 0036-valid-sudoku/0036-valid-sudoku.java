class Solution {
    public boolean func(int r,int c,char b[][]){
        //rows ooda colunm
        for(int i=0;i<9;i++){
            if(i==c)continue;
            if(b[r][i]==b[r][c])return false;
        }
        //col ooda row
        for(int i=0;i<9;i++){
            if(i==r)continue;
            if(b[i][c]==b[r][c])return false;
        }
        //box check
        int nr=(r/3)*3;
        int nc=(c/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int fr=nr+i;
                int fc=nc+j;

                if(fr==r &&fc==c)continue;
                if(b[fr][fc]==b[r][c])return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] b) {
    
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(b[i][j]=='.')continue;
                else {
                    if(func(i,j,b)==false)return false;
                }
            }
        }
        return true;
    }
}