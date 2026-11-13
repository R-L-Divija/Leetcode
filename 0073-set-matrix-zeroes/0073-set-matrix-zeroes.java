class Solution {
    public void setZeroes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
    boolean r[]=new boolean[n];
    boolean c[]=new boolean[m];

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(mat[i][j]==0){
                r[i]=true;
                c[j]=true;
            }
        }
    }
    //set row of every col 0

    for(int i=0;i<n;i++){
        if(r[i]){
            for(int j=0;j<m;j++){
                mat[i][j]=0;
            }
        }
    }
//set col of every row 0

for(int j=0;j<m;j++){
    if(c[j]){
        for(int i=0;i<n;i++){
            mat[i][j]=0;
        }
    }
}
    }
}