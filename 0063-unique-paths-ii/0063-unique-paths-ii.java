class Solution {
    public int func(int r,int c,int a[][],int dp[][]){
        int n=a.length;
        int m=a[0].length;
        if(r==n-1 && c==m-1)return 1;
        
        if(r>=n||c>=m||r<0||c<0||a[r][c]==1)return 0;

        if(dp[r][c]!=0)return dp[r][c];

        int m1=func(r+1,c,a,dp);
        int m2=func(r,c+1,a,dp);

        return dp[r][c]=m1+m2;
    }
    public int uniquePathsWithObstacles(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        if(a[n-1][m-1]==1||a[0][0]==1)return 0;
        int dp[][]=new int[n][m];
        return func(0,0,a,dp);
    }
}