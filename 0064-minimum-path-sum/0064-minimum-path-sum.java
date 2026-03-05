class Solution {
    public int func(int r,int c,int a[][],int dp[][]){
        int n=a.length;
        int m=a[0].length;
        if(r==n-1&&c==m-1)return a[r][c];

        if(r<0||c<0||r>=n||c>=m)return Integer.MAX_VALUE;

        if(dp[r][c]!=-1)return dp[r][c];

        int m1=func(r+1,c,a,dp);
        int m2=func(r,c+1,a,dp);

        return dp[r][c]=a[r][c]+Math.min(m1,m2);
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(0,0,grid,dp);


        //tabulation code


        // dp[0][0]=grid[0][0];
        // for(int i=1;i<m;i++){
        //     dp[0][i]=grid[0][i]+dp[0][i-1];
        // }
        // for(int i=1;i<n;i++){
        //     dp[i][0]=grid[i][0]+dp[i-1][0];
        // }
        // for(int i=1;i<n;i++){
        //     for(int j=1;j<m;j++){
        //         int m1=dp[i-1][j]+grid[i][j];
        //         int m2=dp[i][j-1]+grid[i][j];
        //         dp[i][j]=Math.min(m1,m2);
        //     }
        // }
        // return dp[n-1][m-1];
    }
}