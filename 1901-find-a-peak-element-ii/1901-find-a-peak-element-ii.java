class Solution {
    
    public int[] findPeakGrid(int[][] mat) {
       int l=0;
       int r=mat[0].length;
       int index=0;
       while(l<=r){
        int m=l+(r-l)/2;

        for(int i=0;i<mat.length;i++){
            if(mat[index][m]<mat[i][m])index=i;
        }

        int left=(m>0)?mat[index][m-1]:-1;
        int right=(m<mat[0].length-1)?mat[index][m+1]:-1;

        if(left< mat[index][m]&& right<mat[index][m]){
               return new int[]{index,m};
        }
        else if(right>mat[index][m])l=m+1;
        else r=m-1;
       }
       return new int[]{-1,-1};
    }
}