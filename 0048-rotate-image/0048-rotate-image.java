class Solution {
    public void rev(int[][]m){
        for(int i=0;i<m.length;i++){
            int l=0;
            int r=m.length-1;
            while(l<=r){
                int t=m[i][l];
                m[i][l]=m[i][r];
                m[i][r]=t;
                l++;
                r--;
            }
        }
    }
    public void trans(int [][]m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<=i;j++){
               int t=m[i][j];
               m[i][j]=m[j][i];
               m[j][i]=t;
            }
        }
    }
    public void rotate(int[][] m) {
        trans(m);
        rev(m);
    }
}