class Solution {
    public boolean searchMatrix(int[][] m, int t) {
       int l=0;
       int r=m[0].length-1;

       while(l<m.length &&r>=0){
        if(t==m[l][r])return true;
        else if(t<m[l][r])r--;
        else l++;
       }
       return false;
    }
}