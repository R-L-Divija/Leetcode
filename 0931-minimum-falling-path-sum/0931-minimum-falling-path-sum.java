class Solution {
    int func(int r,int c,int a[][],int dp[][]){
        int n=a.length;
        int m=a[0].length;
        
      
        if(c<0||c>=m)return Integer.MAX_VALUE;
          if(r==n-1)return a[r][c];
        if(dp[r][c]!=Integer.MAX_VALUE)return dp[r][c];
        int m1=func(r+1,c-1,a,dp);
        int m2=func(r+1,c,a,dp);
        int m3=func(r+1,c+1,a,dp);

        int min=Math.min(m1,m2);
        return dp[r][c]=a[r][c]+Math.min(min,m3);
    }
    public int minFallingPathSum(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        int dp[][]=new int[n][m];//store min cost 
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
         ans=Math.min(ans,func(0,j,a,dp));
        }
       return ans;
    }
}